import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int attempts, input, correctNum;
		attempts = 0; //attempts counter
		correctNum = (int)(100 * Math.random())+ 1; //generates random num 1-100
		
		while (true) {
			System.out.println("Pick a number between 1 and 100: ");
			input = kb.nextInt();
			
			if (input < correctNum) {
				System.out.println("Number is low, try again");
				attempts++;
			}
			else if (input > correctNum) {
				System.out.println("Number is high, try again");
				attempts++;
			}
			else if (input == correctNum) {
				attempts++; //counts the last guess as an attempt so i put it before the winning line
				System.out.println("Right On! Attempts: " + attempts);
				break; //breaks out of the loop
			}
			else {
				System.out.println("Not a valid option"); //just in case they enter something else
			}
		}
		
		
		kb.close();
	}

}
