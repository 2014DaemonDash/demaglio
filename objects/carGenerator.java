package object.utilities;

import objects.Car;

/**
 * Generates an Array of Car objects. 
 * @author WootyPooty
 *
 */
public class carGenerator {
	private static Car[] carArray = new Car[15];
	
	
	/**
	 * public Car(double mpg, int numDoors, int year, double price, 
			String fuelType, String make, String model, String carType){
	 */
	public static void constructArray(){
		carArray[0] = new Car(126, 101, 4, 2015, 21510, "electric", "Nissan", "Leaf", "car");
		carArray[1] = new Car(88, 90, 4, 2012, 60000, "electric", "Tesla", "Model S", "car");
		carArray[2] = new Car(18, 24, 4, 2015, 26075, "gas", "GMC", "Sierra", "truck");
		carArray[3] = new Car(44, 34, 4, 2015, 36500, "hybrid", "Ford", "Fussion", "car");
		carArray[4] = new Car(22, 41, 4, 2015, 22400, "gas", "Ford", "Fussion", "car");
		carArray[5] = new Car(30, 37,  4, 2015, 14845, "gas", "Toyota", "Yaris", "car");
		carArray[6] = new Car(28, 37, 4, 2015, 16900, "gas", "Toyota", "Corolla", "car");
		carArray[7] = new Car(25, 35, 4, 2015, 22425, "gas", "Toyota", "Camry", "car");
		carArray[8] = new Car(27, 36, 4, 2015, 22105, "gas", "Honda", "Accord", "sedan");
		carArray[9] = new Car(26, 35, 2, 2015, 23775, "gas", "Honda", "Accord", "coupe");
		carArray[10] = new Car(124, 105, 4, 2015, 39780, "electric", "Honda", "Accord", "sedan");
		carArray[11] = new Car(50, 45, 4, 2015, 29305, "hybrid", "Honda", "Accord", "sedan");
		carArray[12] = new Car(36, 39, 2, 2015, 19995, "gas", "Honda", "CR-Z", "coupe");
		carArray[13] = new Car(30, 39, 4, 2015, 18390, "gas", "Honda", "Civic", "sedan");
		carArray[14] = new Car(29, 38, 2, 2015, 18190, "gas", "Honda", "Civic", "coupe");
	}
	public static Car[] getCarArray(){
		constructArray();
		return carArray;
	}
}
