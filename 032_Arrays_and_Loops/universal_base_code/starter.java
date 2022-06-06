import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] array = new int[1000];
		int x = 0;
		while (x < array.length) {
			int something = rand.nextInt(100);
			array[x] = something;
			x++;
		}

		x = 0;
		while (x < array.length) {
			System.out.println(array[x]);
			x++;
		}
		
		
		


		
	}
}
