package objects;

public class Car extends Item{

	private double mpgCity;
	private double mpgHigh;
	private int numDoors;
	private int year;
	private double price;
	private String fuelType;
	private String make;
	private String model;
	private String carType;

	public Car(double mpgCity, double mpgHigh, int numDoors, int year, double price, 
			String fuelType, String make, String model, String carType){
		this.mpgCity = mpgCity;
		this.mpgHigh = mpgHigh;
		this.numDoors = numDoors;
		this.year = year;
		this.price = price;
		this.fuelType = fuelType;
		this.make = make;
		this.model = model;
		this.carType = carType;
	}

	public double getMpgHigh(){
		return mpgHigh;
	}
	public double getMpgCity(){
		return mpgCity;
	}

	public int getNumDoors(){
		return numDoors;
	}

	public int getYear(){
		return year;
	}

	public double getPrice(){
		return price;
	}

	public String getFuelType(){
		return fuelType;
	}

	public String getMake(){
		return make;
	}

	public String getModel(){
		return model;
	}

	public String getCarType(){
		return carType;
	}

	public void setMpgHigh(double mpg){
		this.mpgHigh = mpg;
	}
	public void setMpgCity(double mpg){
		this.mpgCity = mpg;
	}

	public void setNumDoors(int numDoors){
		this.numDoors = numDoors;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setFuelType(String fuelType){
		this.fuelType = fuelType;
	}
	
	public void setMake(String make){
		this.make = make;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	public void setCarType(String carType){
		this.carType = carType;
	}
	
	public String toString(){


		return 	"mpg City = "+mpgCity+"\n"+
				"mpg High = "+mpgHigh+"\n"+
				"number of Doors = "+numDoors+"\n"+
				"year = "+year+"\n"+
				"price = " +price + "\n"+
				"fuel Type = " +fuelType + "\n"+
				"make = " +make + "\n"+
				"model = " +model + "\n"+
				"car type = " +carType + "\n";
				

	}

}
