import pkg.*;
import java.util.Scanner;
import java.util.Random;
	
	public static int factorial(int n) {
		int factorial;
		if (n == 1) {
			factorial = n;
			return factorial;
		} else if (n > 1) {
			factorial = 1;
			while (n > 0) {
				factorial = factorial * n;
				n--;
			}
			return factorial;
		}
	}
	
	public static void numCominbation(int n, int r) {
		if (r > n) {
			System.out.println("There are 0 ways of choosing " + r + " items from " + n + " choices");
		} else if (r !> n) {
			int something;
			something = (factorial(n) / (factorial(r) * (factorial(n) - factorial(r))));
			System.out.println("There are " + something + " ways of choosing " + r + " items from " + n + " choices");
		}
	}

class starter {
	public static void main(String args[]) {
		// Your code goes below here



		
	}
}
