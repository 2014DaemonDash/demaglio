package objects;

import java.util.HashMap;

public class User {
	private int environment; //0 = city 1 = suburban 2 = rural 
	private int travelDistance;
	private int timeSpentDriving;
	private double budget;
	private String username;
	private Car currentVehicle;
	private HashMap<Car, Integer> pastPurchases;


	public User(int travelDistance, int timeSpentDriving, int budget, 
			String username, Car currentVehicle, int environment){
		this.environment = environment;
		this.travelDistance = travelDistance;
		this.timeSpentDriving = timeSpentDriving;
		this.budget = budget;
		this.username = username;
		this.currentVehicle = currentVehicle;
	}

	public void addPastPurchase(Car car, int rating){
		pastPurchases.put(car, rating);
	}

	public int getTravelDistance(){
		return travelDistance;
	}

	public int getTimeSpentDriving(){
		return timeSpentDriving;
	}

	public double getBudget(){
		return budget;
	}

	public String getUsername(){
		return username;
	}

	public Car getCurrentVehicle(){
		return currentVehicle;
	}

	public HashMap<Car, Integer> getPastPurchases(){
		return pastPurchases;
	}

	public void setTravelDistance(int travelDistance){
		this.travelDistance = travelDistance;
	}

	public void setTimeSpentDriving(int timeSpentDriving){
		this.timeSpentDriving = timeSpentDriving;
	}

	public void setBudget(double budget){
		this.budget = budget;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public void setCurrentVehicle(Car currentVehicle){
		this.currentVehicle = currentVehicle;
	}
	
	/**
	 * compares two users and returns a score based on how well they match.
	 * A close match is a 0 and the worst possible match is 300.
	 * @param other the other user we are comparing to
	 * @return int score between 0 and 300
	 */
	public int matchUser(User other){
		int score = 0;
		int distanceDiff;
		int timeDiff;
		
		//gets environment score
		if(this.environment != other.environment){
			if(Math.abs((this.environment - other.environment)) == 1){
				score += 50;
			}else{
				score += 100;
			}
		}
		
		//gets travelDistance score
		if(this.travelDistance>other.travelDistance){
			distanceDiff = this.travelDistance - other.travelDistance;
		}else{
			distanceDiff = other.travelDistance - this.travelDistance;
		}
		if(distanceDiff > 100){
			score+=100;
		}else{
			score+=distanceDiff;
		}
		
		//gets timeDiff score
		if(this.timeSpentDriving>other.timeSpentDriving){
			timeDiff = this.timeSpentDriving - other.travelDistance;
		}else{
			timeDiff = other.timeSpentDriving - this.timeSpentDriving;
		}
		if(timeDiff > 100){
			score+=100;
		}else{
			score+=timeDiff;
		}
		
		return score;
		
	}

	
}

