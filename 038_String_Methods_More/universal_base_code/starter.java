import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		String name = "Benjamin Yeom";
		
		for (int i = 0; i < name.length(); i++) {
			if (name.substring(i, i+1).equals(" ")) {
				System.out.print(name.substring(i+1));
			}
		}
	}
}
