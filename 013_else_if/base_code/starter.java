import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		int secret;
		secret = 456;
		System.out.print("Guess a number between 1-1000: ");
		int guess = sc.nextInt();
		
		if (guess == secret) {
			System.out.println("Congrats! You are correct");
		} else if (guess < secret) {
			System.out.print("Higher");
		} else if (guess > secret) {
			System.out.print("Lower");
		}
	}
}
