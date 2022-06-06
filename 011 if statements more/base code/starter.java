import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		// System.out.print("First Number: ");
		// int one = sc.nextInt();
		
		// System.out.print("Second Number: ");
		// int two = sc.nextInt();
		
		// if (one != two) {
		// 	System.out.println("The values are different");
		// } else {
		// 	System.out.println("The values are equal");
		// }
		
		System.out.print("First Number: ");
		int one = sc.nextInt();
		
		System.out.print("Second Number: ");
		int two = sc.nextInt();
		
		System.out.print("Third Number: ");
		int three = sc.nextInt();
		
		if (one > two) {
			int four;
			four = 0;
			four += one;
			if (four > three) {
				System.out.println("The First Number is the largest number");
			} else {
				System.out.println("The Third Number is the largest number");
			}
			if (two < three) {
				System.out.println("The Second Number is the smallest number");
			} else {
				System.out.println("The Third Number is the smallest number");
			}
		} else {
			int five;
			five = 0;
			five += two;
			if (five > three) {
				System.out.println("The Second Number is the largest number");
			} else {
				System.out.println("The Third Number is the largest number");
			}
			if (one < three) {
				System.out.println("The First Number is the smallest number");
			} else {
				System.out.println("The Third Number is the smallest number");
			}
		}
		
		
	}
}
