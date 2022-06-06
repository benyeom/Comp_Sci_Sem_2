import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		int [][] arr = new int[2][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		
		int rows = arr.length;
		int columns = arr[0].length;
		
		int sum = 0;
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
				counter++;
			}
		}
		
		int average = sum/counter;
		System.out.println(average);
	}
}
