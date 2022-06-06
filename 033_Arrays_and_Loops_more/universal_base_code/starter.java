import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] array = new int[100];
		int x = 0;
		int min = 101;
		int max = 0;
		int sum = 0;
		
		while (x < array.length) {
			int something = rand.nextInt(100) + 1;
			array[x] = something;
			x++;
		}
		
		x = 0;
		while (x < array.length) {
			if (array[x] < min) {
				min = array[x];
			}
			x++;
		}
		
		System.out.println("MIN: " + min);
		
		x = 0;
		while (x < array.length) {
			if (array[x] > max) {
				max = array[x];
			}
			x++;
		}
		
		System.out.println("MAX: " + max);

		x = 0;
		while (x < array.length) {
			sum += array[x];
			x++;
		}
		
		System.out.println("AVERAGE: " + sum / array.length);
		
	}
}
