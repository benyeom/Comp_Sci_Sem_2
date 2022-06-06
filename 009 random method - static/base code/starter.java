import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int one = rand.nextInt(10);
		System.out.println(one);
		int two = rand.nextInt(100);
		System.out.println(two + 1);
		double three = rand.nextDouble();
		System.out.println(three + 2.5);
		
		int four = rand.nextInt(575);
		double five = rand.nextDouble();
		System.out.print(four + five + 14);
		
		int six = rand.nextInt(3);
		System.out.println(six);
	}
}
