package objects;

public class Car extends Item{

	
	/*
	private double mpg;
	private int numDoors;
	private int year;
	private double price;
	private String fuelType;
	private String make;
	private String model;
	private String carType;
	*/

	/**
	 * 
	 * @param super
	 * @param numDoors
	 * @param year
	 * @param price
	 * @param fuelType
	 * @param make
	 * @param model
	 * @param carType
	 */
	public Car(double mpgCity,double mpgHigh, int numDoors, int year, double price, 
			String fuelType, String make, String model, String carType){
		
		super.parameters.add(mpgCity);
		super.parameters.add(mpgHigh);
		super.parameters.add(numDoors);
		super.parameters.add(year);
		super.parameters.add(price);
		super.parameters.add(fuelType);
		super.parameters.add(make);
		super.parameters.add(model);
		super.parameters.add(carType);
		
	}

	public double getMpgCity(){
		Object obj =  super.parameters.get(0);
		return (double) obj;
	}

	public double getMpgHigh(){
		Object obj =  super.parameters.get(1);
		return (double) obj;
	}
	
	public int getNumDoors(){
		Object obj =  super.parameters.get(2);
		return (int) obj;
	}
	
	
	public int getYear(){
		Object obj =  super.parameters.get(3);
		return (int) obj;
	}

	public double getPrice(){
		Object obj =  super.parameters.get(4);
		return (double) obj;
	}
	
	public String getFuelType(){
		return (String) super.parameters.get(5);
	}
	
	public String getMake(){
		return (String) super.parameters.get(6);
	}
	
	public String getModel(){
		return (String) super.parameters.get(7);
	}
	
	public String getCarType(){
		return (String) super.parameters.get(8);
	}

	
	public String toString(){


		return 	"mpg City= "+getMpgCity()+"\n"+
				"mpg High= "+getMpgHigh()+"\n"+
				"number of Doors = "+getNumDoors()+"\n"+
				"year = "+getYear()+"\n"+
				"price = " +getPrice() + "\n"+
				"fuel Type = " +getFuelType() + "\n"+
				"make = " +getMake() + "\n"+
				"model = " +getModel() + "\n"+
				"car type = " +getCarType() + "\n";
				
			

	}

}
