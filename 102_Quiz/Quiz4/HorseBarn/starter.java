import pkg.*;
import java.util.Scanner;
import java.util.Random;

public int findHorseSpace(String name) {
	int index = -1;
	for (int i = 0; i < spaces.length; i++) {
		if (spaces[x].getName().equals(name)) {
			index = x;
			return x;
		}
	}
	return index;
}

public static void Consolidate() {
	Horse[] x = new Horse[spaces.length];
	int j = 0;
	
	for (int i = 0; i < spaces.length; i++) {
		if (spaces[i] != null) {
			x[j] = spaces[i];
			j++;
		}
	}
	for (int i = 0; i < spaces.length; i++) {
		spaces[i] = x[i];
	}
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
}
