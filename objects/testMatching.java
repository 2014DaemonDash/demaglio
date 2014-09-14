package testin;

import java.util.ArrayList;

import objects.Car;
import objects.Producer;
import objects.User;
import objects.carMatchOrganizer;

public class testMatching {
	
	public static void main(String[] args) {
		ArrayList matches = new ArrayList();
		int cap = 60;
		User[] users = Producer.makeUsers();
		User myUser = new User(25, 45, 10600, "testUser", null, 0);
		for(int i = 0; i< users.length; i++){
			if(myUser.matchUser(users[i]) < cap){
				matches.add(users[i].getCurrentVehicle());
				if(matches.size()<10 && cap <300){
					cap+=60;
				}
			}
		}
		matches = carMatchOrganizer.finalList(myUser, matches);
		for(Object x : matches){
			if(x instanceof Car){
				Car temp = (Car) x;
				System.out.println(temp.getMake()+" "+temp.getModel());
			}
		}
	}
	
	
	

}

