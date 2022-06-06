import java.util.Scanner;
import java.util.Random;

	//HOMEWORK #7
	// class Dog {
	// 	//Global Variables
	// 	String name;
	// 	int age;
	// 	String breed;
		
		
	// 	//Constructors
	// 	public Dog() {
	// 		name = "Clifford";
	// 		age = 3;
	// 		breed = "big red dog";
	// 	}
		
	// 	public Dog(String a) {
	// 		name = a;
	// 		age = 1;
	// 		breed = "dog dog";
	// 	}
		
	// 	public Dog(String a, String b) {
	// 		name = a;
	// 		age = 1;
	// 		breed = b;
	// 	}
		
	// 	public Dog(String a, int b) {
	// 		name = a;
	// 		age = b;
	// 		breed = "dog dog";
	// 	}
		
		
	// 	//Methods
	// 	public void setName(String a) {
	// 		name = a;
	// 	}
		
	// 	public void setAge(int a) {
	// 		age = a;
	// 	}
		
	// 	public void setBreed(String a) {
	// 		breed = a;
	// 	}
		
	// 	public String getName() {
	// 		return name;
	// 	}
		
	// 	public int getAge() {
	// 		return age;
	// 	}
		
	// 	public String getBreed() {
	// 		return breed;
	// 	}
		
	// 	public void isSleeping() {
	// 		Random rand = new Random();
	// 		int something = rand.nextInt(2);
	// 		if (something == 1) {
	// 			System.out.print(name + " is sleeping.");
	// 		} else {
	// 			System.out.print(name + " barks!");
	// 		}
	// 	}
		
	// 	public void bark() {
	// 		System.out.print(name + " barks!");
	// 	}
	// }
	
	// CAT CLASS PRACTICE
// class Cat {
// 	String name;
		
// 	public Cat() {
// 		name = "Garfield";
// 	}
// 	public Cat(String a) {
// 		name = a;
// 	}
		
// 	public void meow() {
// 		System.out.print(name + " meows.");
// 	}
// }

class starter {
	
	//HOMEWORK #6
class hw6{

    public static boolean checkPrime(int x){
        int i = 2;
        while(i < x){
            if(x % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }   

    public static void printPrimes(int x){
        int i = 2;
        while(i < x+1){
            if(checkPrime(i)){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number and we'll print out every prime until that number: ");
        printPrimes(sc.nextInt());
    }

}
	
	// CLASS PRACTICE
	// public static int add(int a, int b) {
	// 	int x;
	// 	x = a + b;
	// 	System.out.print(x);
	// 	return x;
	// }
	
	// public static int mult(int a, int b) {
	// 	int y;
	// 	y = a * b;
	// 	if (y % 3 == 0) {
	// 		System.out.println(y);
	// 	} else {
	// 		System.out.print("Not divisible by 3");
	// 	}
	// 	return y;
	// }
	
	public static void main(String args[]) {
		
		// HOMEWORK #4
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Type a number: ");
		// int one = sc.nextInt();
		// System.out.print("Type another number: ");
		// int two = sc.nextInt();
		// if (one % 2 == 0) {
		// 	System.out.print("First number is even.");
		// } else {
		// 	System.out.print("First number is odd.");
		// }
		// if (two % 2 == 0) {
		// 	System.out.print(" Second number is even.");
		// } else {
		// 	System.out.println(" Second number is odd.");
		// }
		
		// if (one % 3 == 0 && one % 4 == 0 && one % 5 == 0) {
		// 	System.out.print("First number is divisible by 3, 4, and 5.");
		// } else {
		// 	System.out.print("First number is not divisible by 3, 4, and 5.");
		// }
		
		// if (two % 3 == 0 && two % 4 == 0 && two % 5 == 0) {
		// 	System.out.print(" Second number is divisible by 3, 4, and 5 as well.");
		// } else {
		// 	System.out.print(" Second number is not divisible by 3, 4, and 5.");
		// } 
		
		
		// HOMEWORK #5
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// Scanner sc = new Scanner(System.in);
		// Random rand = new Random();
		
		// int dollars = 100;
		// String something;
		
		// System.out.print("How much do you want to bet?: ");
		// int wager = sc.nextInt();
		// something = sc.nextLine();
		// while (wager > 100) {
		// 	System.out.print("You only have $100! Bet again: ");
		// 	wager = sc.nextInt();
		// 	something = sc.nextLine();
		// }
		
		// int one = rand.nextInt(10) + 1;
		// int two = rand.nextInt(10) + 1;
		// int three = rand.nextInt(10) + 1;
		// System.out.println("Slot machine numbers: " + one + ", " + two + ", " + three);
		
		// if (one == two && one == three) {
		// 	wager = wager * 3;
		// 	dollars = dollars + wager;
		// } else if (one == two || one == three || two == three) {
		// 	wager = wager * 2;
		// 	dollars = dollars + wager;
		// } else if (one != two && one != three && two != three) {
		// 	dollars = dollars - wager;
		// }
		
		// System.out.println("You have " + dollars + " left.");
		
		// System.out.print("Do you wish to continue?: ");
		// String play = sc.nextLine();
		
		// if (play == "Yes" || play == "yes" || play == "Y" || play == "y") {
		// 	System.out.print("wassup");
		// 	//not finished
		// } else if (play == "No" || play == "no" || play == "N" || play == "n") {
		// 	return;
		// }
		
		
		
		
		// HOMEWORK #6
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Input a number and we'll print out every prime until that number:");
		// int input = sc.nextInt();

		
		
		// CAT CLASS PRACTICE
		// Cat one = new Cat();
		// Cat two = new Cat("Ben");
		// one.meow();
		// two.meow();
		
		
		
		//HOMEWORK #7
		// Dog one = new Dog("Ben", 5);
		// Dog two = new Dog("Wes", "Poodle");
		// one.isSleeping();
		
		// HOMEWORK #9
		// Random rand = new Random();
		// int[] something = new int[20];
		// int[] something2 = new int[20];
		// for (int i = 0; i < something.length; i++) {
		// 	int one = rand.nextInt(50) + 1;
		// 	something[i] += one;
		// 	System.out.print(something[i] + " ");
		// }
		
		// System.out.println();
		
		// int j = 19;
		// 	for (int i = 0; i < something2.length; i++) {
		// 		something2[i] += something[j];
		// 		System.out.print(something2[i] + " ");
		// 		j--;
		// 	}
		
		// ASCII TURKEY EXERCISE
		// String[] array = new String[41];
		//   array[0] = "                                   ----------                                   ";
		//   array[1] = "                             ------          ------                             ";
		//   array[2] = "                        -----   -              -   -----                        ";
		//   array[3] = "                    ----         -            -         ----                    ";
		//   array[4] = "                 ---              -          -              ---                 ";
		//   array[5] = "              ---                  -        -                  ---              ";
		//   array[6] = "            --    -                -        -                -    --            ";
		//   array[7] = "          --       -                -      -                -       --          ";
		//   array[8] = "        --          -               -      -               -          --        ";
		//   array[9] = "       --             -             -      -             -             --       ";
		//  array[10] = "     --   -             -             ----             -             -   --     ";
		//  array[11] = "    --     -             -          --    --          -             -     --    ";
		//  array[12] = "  --        -             -       --        --       -             -       --   ";			
		//  array[13] = " -           -             -     --          --     -             -          -  ";
		//  array[14] = " -            -             -   --  (O)   (O) --   -             -           -  ";
		//  array[15] = "  -             -            -  --    -   -   --  -            -            -   ";
		//  array[16] = "    -             -           -  --    - -   --  -           -            -     ";
		//  array[17] = "      -            -           -  --    -   --  -           -          -        ";
		//  array[18] = "         -           -          -  --      --  -          -          -          ";
		//  array[19] = "           -          -          - --      -- -          -         -            ";
		//  array[20] = "             -         -          --        --          -        -              ";
		//  array[21] = "               -        -       --            --       -       -                ";
		//  array[22] = "                -         -   --                --   -        -                 ";
		//  array[23] = "                  -         --                    --        -                   ";
		//  array[24] = "                   -      --       ___________      --     -                    ";
		//  array[25] = "                     -  --      --            --     --  -                      ";
		//  array[26] = "                       --     -                  -     --                       ";
		//  array[27] = "                      --    -                      -    --                      ";
		//  array[28] = "                     --    -                        -    --                     ";
		//  array[29] = "                     --   -                          -   --                     ";
		//  array[30] = "                     --   -                          -   --                     ";
	 //	 array[31] = "                     --   -                          -   --                     ";
		//  array[32] = "                      --  -                          -  --                      ";
		//  array[33] = "                       --  -                        -  --                       ";
		//  array[34] = "                         -- -                      - --                         ";
		//  array[35] = "                           --                      --                           ";
		//  array[36] = "                           - --                  -- -                           ";
		//  array[37] = "                          ---  ------------------  ---                          ";
		//  array[38] = "                         - - -                    - - -                         ";
		//  array[39] = "                        -  -  -                  -  -  -                        ";
		//  array[40] = "                       --  -  --                --  -  --                       ";
		
		// System.out.println(array[0]);
		// System.out.println(array[1]);
		// System.out.println(array[2]);
		// System.out.println(array[3]);
		// System.out.println(array[4]);
		// System.out.println(array[5]);
		// System.out.println(array[6]);
		// System.out.println(array[7]);
		// System.out.println(array[8]);
		// System.out.println(array[9]);
		// System.out.println(array[10]);
		// System.out.println(array[11]);
		// System.out.println(array[12]);
		// System.out.println(array[13]);
		// System.out.println(array[14]);
		// System.out.println(array[15]);
		// System.out.println(array[16]);
		// System.out.println(array[17]);
		// System.out.println(array[18]);
		// System.out.println(array[19]);
		// System.out.println(array[20]);
		// System.out.println(array[21]);
		// System.out.println(array[22]);
		// System.out.println(array[23]);
		// System.out.println(array[24]);
		// System.out.println(array[25]);
		// System.out.println(array[26]);
		// System.out.println(array[27]);
		// System.out.println(array[28]);
		// System.out.println(array[29]);
		// System.out.println(array[30]);
		// System.out.println(array[31]);
		// System.out.println(array[32]);
		// System.out.println(array[33]);
		// System.out.println(array[34]);
		// System.out.println(array[35]);
		// System.out.println(array[36]);
		// System.out.println(array[37]);
		// System.out.println(array[38]);
		// System.out.println(array[39]);
		// System.out.println(array[40]);
		
		
		
		//HOMEWORK #10
		int[] array = new int[20];
		Random rand = new Random();
		for (int i = 0; i < 20; i++) {
			int something = rand.nextInt(10) + 1;
			array[i] = something;
		}
		
		if (array[i] == array[i] + 1) {
			System.out.print("There's a duplicate");
		}
		

		
		
		
		
		
		
		
		
		
		
		
	}
}
