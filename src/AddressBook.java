import java.util.*;

public class AddressBook {
	private Scanner scan = new Scanner(System.in);
	private BuddyInfo[] friends = new BuddyInfo[30];
	private int numOfBuddies = 0;
	
	public AddressBook() {
		boolean finished = false;
		
		while(! finished) {
			System.out.println("What can I do for you (enter 'help' for assistance)?");
			String response = scan.nextLine();
			
			if(response.equalsIgnoreCase("help")) {
				System.out.println("You can enter 4 commands: 'help', 'quit', 'add buddy', 'remove buddy'");
			}
			if(response.equalsIgnoreCase("quit")) {
				finished = true;
			}
			if(response.equalsIgnoreCase("add buddy")) {
				addBuddy();
			}
			if(response.equalsIgnoreCase("remove buddy")) {
				removeBuddy();
			}
			if(response.equalsIgnoreCase("view buddy")) {
				viewBuddies();
			}
		}
		scan.close();
	}
	
	public void addBuddy() {
		System.out.println("Enter the name of your new friend");
		String name = scan.nextLine();
		friends[numOfBuddies] = new BuddyInfo(name);
		friends[numOfBuddies].SayHello();
		
		numOfBuddies++;
	}
	
	public void removeBuddy() {
		System.out.println("Who has been unfriended?");
		String unfriend = scan.nextLine();
		Boolean found = false;
		
		for(int i = 0; i < numOfBuddies; i++) {
			if(friends[i].getBuddy().equalsIgnoreCase(unfriend)) {
				if(i == numOfBuddies - 1) {
					friends[i] = null;
				} else {
					BuddyInfo tempBud = friends[i];
					friends[i] = friends[i + 1];
					friends[i + 1] = tempBud;
				}
				
				found = true;
			}
		}
		
		if(found) {
			numOfBuddies--;
		}
	}
	
	public void viewBuddies() {
		for(int i = 0; i < numOfBuddies; i++) {
			System.out.println(friends[i].getBuddy());
		}
	}
}
