import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toStringArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
	
	public static int getArrayAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (sum / array.length);
	}
	
	public static int getArrayMax(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int[] array) {
		int min = 100;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static void main(String args[]) {
		Random rand = new Random();
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			int something = rand.nextInt(100) + 1;
			array[i] = something;
		}
		
		
		toStringArray(array);
		System.out.println();
		System.out.println(getArrayAverage(array));
		System.out.println(getArrayMax(array));
		System.out.println(getArrayMin(array));
		
		
	}
}
