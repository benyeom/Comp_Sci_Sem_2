import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Random rand = new Random();
		int x = 0;
		while (x < 100) {
			int something = rand.nextInt(100) + 1;
			System.out.println(something);
			x++;
		}
		
		
	}
}
