package objects;

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


	public void carRanking(User user){


	}
	public static ArrayList finalList(User user, ArrayList carList){
		ArrayList finalList = new ArrayList();
		ArrayList currList = (ArrayList)carList.clone();
		Car bestCar = null;
		while(currList.size()>0){
			bestCar = null;
			for(Object x : currList){
				if(x instanceof Car){
					Car temp = (Car)x;
					if(bestCar == null){
						bestCar = temp;
					}else{
						bestCar = betterCar(bestCar, temp, user);
					}
				}
			}
			finalList.add(bestCar);
			currList.remove(bestCar);
		}
		return finalList;
	}


	public static Car betterCar(Car car1, Car car2, User user){

		int avgDist = user.getTravelDistance();
		int scoreCar1 = 0;
		int scoreCar2 = 0;

		if(avgDist > 40){
			if(car1.getFuelType().equals("gas")){ scoreCar1 = scoreCar1+10;}
			if(car1.getFuelType().equals("hybrid")){ scoreCar1 = scoreCar1+5;}

			if(car2.getFuelType().equals("gas")){ scoreCar2 = scoreCar2+10;}
			if(car2.getFuelType().equals("hybrid")){ scoreCar2 = scoreCar2+10;}

		} else {

			if(car1.getFuelType().equals("electric")){ scoreCar1 = scoreCar1+10;}
			if(car1.getFuelType().equals("hybrid")){ scoreCar1 = scoreCar1+5;}

			if(car2.getFuelType().equals("electric")){ scoreCar2 = scoreCar2+10;}
			if(car2.getFuelType().equals("hybrid")){ scoreCar2 = scoreCar2+5;}

		}

		double priceDiff1 = Math.abs(car1.getPrice() - user.getBudget());
		double priceDiff2 = Math.abs(car2.getPrice() - user.getBudget());

		if(priceDiff1 < 2000){	scoreCar1 = scoreCar1 + 10;	}
		if(priceDiff1 < 5000){	scoreCar1 = scoreCar1 + 5;	}

		if(priceDiff2 < 2000){	scoreCar2 = scoreCar2 + 10;	}
		if(priceDiff2 < 5000){	scoreCar2 = scoreCar2 + 5;	}

		if( car1.getPrice() < user.getBudget()){ scoreCar1 = scoreCar1 + 5;	}
		if( car2.getPrice() < user.getBudget()){ scoreCar2 = scoreCar2 + 5;	}

		if( (car1.getMpgCity()+car1.getMpgHigh())/2 > (car2.getMpgCity()+car2.getMpgHigh())/2 ){
			scoreCar1 = scoreCar1 + 
					(int)(car1.getMpgCity()+car1.getMpgHigh())/2 - (int)(car2.getMpgCity()+car2.getMpgHigh())/2;
		}

		if( (car1.getMpgCity()+car1.getMpgHigh())/2 < (car2.getMpgCity()+car2.getMpgHigh())/2 ){
			scoreCar2 = scoreCar2 + 
					(int)(car2.getMpgCity()+car2.getMpgHigh())/2 - (int)(car1.getMpgCity()+car1.getMpgHigh())/2;
		}


		if (scoreCar1 >= scoreCar2) {
			return car1;
		} else {
			return car2;
		}

	}


}
