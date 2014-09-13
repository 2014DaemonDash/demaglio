package objects;

import java.util.HashMap;

public class User {
	private int travelDistance;
	private int timeSpentDriving;
	private double budget;
	private String username;
	private Car currentVehicle;
	private HashMap<Car, Integer> pastPurchases;


	public User(int travelDistance, int timeSpentDriving, double budget, 
			String username, Car currentVehicle){
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

	
}

