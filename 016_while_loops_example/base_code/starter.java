import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
	Scanner sc = new Scanner(System.in);
	System.out.print("What is your name: ");
	String name = sc.nextLine();
	System.out.print("How many times do you want it printed: ");
	int num1 = sc.nextInt();
	
	while(true) {
		System.out.println(name);
		if (num1 == 1) {
			break;
		}
		num1 -= 1;
	}

	// int num2 = 0;
	// while(true) {
	// 	System.out.print(name);	
	// 	if (num2 == num1) {
	// 		break;
	// 	}
	// 	num2 += 1;
	// }

		
	}
}
