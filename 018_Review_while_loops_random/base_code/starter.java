import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	
	int secret = 573;
	System.out.print("Guess a number between 0 - 1000: ");
	int guess = sc.nextInt();
	
	while (secret != guess) {
		System.out.print("Try again!: ");
		guess = sc.nextInt();
	} 
	
	


		
	}
}
