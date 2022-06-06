import java.util.Scanner;
import java.util.Random;

class HW10 {
	
	public static void main(String args[]) {
		
		
		//HOMEWORK #10
		//Part 1
		int[] array = new int[20];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int something = rand.nextInt(10) + 1;
			array[i] = something;
		}
		
		//Part 2
		int number = 0;
		int target = rand.nextInt(10) + 1;
		System.out.println("The target number is: " + target);
		for (int i = 0; i < array.length; i++) {
			if (target == array[i]) {
				number++;
				System.out.println("The duplicates are at: " + i);
			}
		}
		
		System.out.println("There are " + number + " duplicates");
		
		//Part 3
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i+1]) {
				System.out.println("The consecutives are at: " + i + ", " + (i + 1));
				System.out.println("And the consecutive number was " + array[i]);
			}
		}

		

		
		
		
		
		
		
		
		
		
		
		
	}
}
