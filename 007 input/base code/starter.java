import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your first name?: ");
		String name = sc.nextLine();
		
		System.out.print("What is your age?: ");
		int age = sc.nextInt();
		
		System.out.print("What month were you born? (1-12): ");
		int month = sc.nextInt();
		
		System.out.print("What is your b-day day?: ");
		int day = sc.nextInt();
		
		System.out.print("What is your b-day year?: ");
		int year = sc.nextInt();
		
		System.out.print("How much is a buck fifty?: ");
		double money = sc.nextDouble();
		
		System.out.println("Your name is " + name + " and you are " + age + " years old. You were born on " + month + " " + day + ", " + year + ". You also said that a buck fifty is equal to " + money);
		
	}
}
