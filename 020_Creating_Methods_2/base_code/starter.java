import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b) {
		int ans = a;
			for (int i = 0; b > i + 1; i++) {
			ans = ans * a;
		}
		System.out.print(ans);
		return ans;
	}
	
	public static void main(String args[]) {
		// Your code goes below here

		pow(2, 2);
		
	}
}
