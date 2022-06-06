import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		String wizard = new String("wizard");
		String warrior = new String("warrior");
		String rogue = new String("rogue");
		String Wizard = new String("Wizard");
		String Warrior = new String("Warrior");
		String Rogue = new String("Rogue");
		System.out.print("Become a wizard, warrior, or rogue: ");
		String role = sc.nextLine();
		
		if role == wizard || role == warrior || role == rogue {
			System.out.print("Interesting, I would become a " + role + " myself!");
		}
		
		// if (role == wizard || role == warrior || role == rogue || role == Wizard || role == Warrior || role == Rogue) {
		// 	System.out.print("nice");
		// } else {
		// 	System.out.print("nope");
		// }
		
	}
}
