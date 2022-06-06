import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dwarf {
	String name;
	int age;
	
	public Dwarf() {
		name = "";
		age = 0;
	}
	
	public void setName(String a) {
		name = a;
	}
	
	public void setAge(int b) {
		age = b;
	}
		
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		String[] name = {"Grumpy", "Dopey", "Doc", "Happy", "Bashful", "Sneezy", "Sleepy"};
		
		
		Dwarf[] dwarf = new Dwarf[100];
		for (int i = 0; i < dwarf.length; i++) {
			dwarf[i] = new Dwarf();
		}
		
		for (int j = 0; j < dwarf.length; j++) {
			int something = rand.nextInt(6);
			dwarf[j].setName(name[something]);
		}
		
		for (int i = 0; i < dwarf.length; i++) {
			int something = rand.nextInt(100) + 1;
			dwarf[i].setAge(something);
		}
		
		for (int i = 0; i < dwarf.length; i++) {
			System.out.println(dwarf[i].getName());
			System.out.println(dwarf[i].getAge());
		}
		
	}
}
