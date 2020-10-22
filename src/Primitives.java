
public class Primitives {
	public static void main(String[] commandLinePassedIn) {
		
		int i = 10;
		
		// the single most important keyword for making interesting program
		
		if (i == 10) {
			System.out.println("We entered the 1st if statement; this means i == 10");
		}
		// with an if statement we can add on any number of if else statements for additional conditions
		// we can terminate with a single else statement if there are no matching conditions
		
		// loops are a way to execute the same block of code many times depending on a condition
		// you have ten users and need each one to get a random favorite color
		i = 0;
		// while loop
		while (i < 5) {
			System.out.println("awesome");
			i++;
		}
		
		
		// a do while loop will always execute at least once
		do {
			System.out.println("cool");
			i++;
		} while (i != 10);
		
		// for loop is most useful
		// takes in 3 parts
		// part one is for declaring a variable for the loop to use (optional)
		// part two is the conditional to terminate the loop (optional)
		// part three is what to do after each iteration completes (optional)
		
		for (int x = 3; x < 30; x++)  {
			if (x % 3 == 0) {
				System.out.println("awesome possum");
			}
		}
		
		// a fancy if-else statement
		i = 1;
		switch (i) {
			case 0:{
				System.out.println("Case 0");
				break;
			}
			case 1:{
				System.out.println("Case 1");
				break;
			}
			
			default:{
				System.out.println("Default case");
				break;
			}
		}
	}
}	

