//Vikrant Suryadevara
import java.util.Scanner;
public class lab4 {
	public static void main(String[] args) {
		//The scanner key allows the user to input how many books they want
		Scanner key = new Scanner(System.in);
		System.out.println("How many books did you prucahse at BN booksellers this month");
		int points = key.nextInt();
		// the if function checks if the books that are inputted are negative, if it is negative it will exit the program.
		if (points< 0) {
			System.out.println("Invalid value entered! Exiting the program!");
			return;
		}
		//the switch statement allows us to detect user input and correspond each input to the answer (ex: inputting 0 gets the case 0 output).
		switch(points)
		{
		case 0:
			System.out.println("You have not earned any points yet. Make a book purchase to start earning points!");
//			// The break statement is used to exit a loop or switch statement prematurely. 
			break;
		case 1:
			System.out.println("Congratulations!!! you have earned 5 points");
			System.out.println("You may redeem these points on your next book purchase!");
			break;
		case 2:
			System.out.println("Congratulations!!! you have earned 15 points");
			System.out.println("You may redeem these points on your next book purchase!");
			break;
		case 3:
			System.out.println("Congratulations!!! you have earned 30 points");
			System.out.println("You may redeem these points on your next book purchase!");
			break;
			//the default function is the "else" statement in a if else function
			default:
				System.out.println("Congratulations!!! you have earned 60 points");
				System.out.println("You may redeem these points on your next book purchase!");
				
		}
	}	
}
