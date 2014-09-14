package testin;

import java.util.ArrayList;

import objects.Car;
import objects.Producer;
import objects.User;

public class testMatching {
	
	public static void main(String[] args) {
		ArrayList matches = new ArrayList();
		User[] users = Producer.makeUsers();
		User myUser = new User(25, 43, 25600, "testUser", null, 0);
		for(int i = 0; i< users.length; i++){
			if(myUser.matchUser(users[i]) < 60){
				matches.add(users[i].getCurrentVehicle());
			}
		}
		
		for(Object x : matches){
			if(x instanceof Car){
				Car temp = (Car) x;
				System.out.println(temp.getMake()+" "+temp.getModel());
			}
		}
	}
	
	
	

}

