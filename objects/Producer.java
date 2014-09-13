package objects;

public class Producer {

	
	public User[] makeUsers(){
		User[] users = new User[10];
		
		/* travel distance, time spent driving, budget, username, current vehicle */
		users[0] = new User(34, 91, 20000, "user1", null);
		users[1] = new User(10, 21, 15000, "user2", null);
		users[2] = new User(40, 110, 45000, "user3", null);
		users[3] = new User(20, 50, 35000, "user4", null);
		users[4] = new User(24, 45, 40000, "user5", null);
		users[5] = new User(50, 125, 50000, "user6", null);
		users[6] = new User(5, 15, 10000, "user7", null);
		users[7] = new User(30, 72, 20000, "user8", null);
		users[8] = new User(15, 35, 26000, "user9", null);
		users[9] = new User(45, 85, 32000, "user10", null);
		return users;
	}
}
