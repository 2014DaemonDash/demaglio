package object.utilities;

import java.util.ArrayList;

import objects.Car;
import objects.User;

/**
 * once a list of car matches has been made this class will contain tools to organize
 * thoes cars and list them in a ranked order.
 * 
 * for example if the user could use electric cars it would suggest them higher than
 * gas cars.  It would also order the cars based on MPG and cost.
 * 
 * @author WootyPooty
 *
 */
public class carMatchOrganizer {
	private boolean electricViable;
	private boolean hybridViable;
	private ArrayList matches;
	private User user;
	private ArrayList finalList;
	
	public carMatchOrganizer(User user, ArrayList carMatches){
		matches = carMatches;
	
		while(matches.size()!=0){
			Car bestCar = null;
			for(Object x : matches){
				if(x instanceof Car){
					Car temp = (Car)x;
					bestCar = bestCar(bestCar, temp, user);
				}
			}
			finalList.add(bestCar);
			matches.remove(bestCar);
		}
	}
	public Car bestCar(Car car1, Car car2, User user){
		int car1Score = 0;
		int car2Score = 0;
		if(car1.getFuelType().equals("electric") && !car2.getFuelType().endsWith("electric")){
			car1Score++;
		}
		if(car2.getFuelType().equals("electric") && !car1.getFuelType().equals("electric")){
			return car2;
		}
		if(car1.getFuelType().equals("hybrid") && !car2.getFuelType().endsWith("gas")){
			car1Score++;
		}
		if(car2.getFuelType().equals("hybrid") && !car1.getFuelType().equals("gas")){
			return car2;
		}
		if(car1.getMpgCity() > car2.getMpgCity()){
			return car1;
		}else if(car2.getMpgCity() > car1.getMpgCity()){
			return car2;
		}else{
			if(car1.getMpgHigh() > car2.getMpgHigh()){
				return car1;
			}else if(car2.getMpgHigh() > car1.getMpgHigh()){
				return car2;
			}else{
				
			}
		}
		return null;
		
		
		
		
	}
	

}
