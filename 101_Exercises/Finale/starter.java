import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class Hangman{
	private String guessingWord;	//The word trying to be guessed
	private int numTries;			//How many tries the user has
	
	//Empty Constructor
	public Hangman() {
		generateWord();
		numTries = 5;
	}
	//Integer Constructor
	public Hangman(int a) {
		generateWord();
		numTries = a;
	}

	// GIVEN - meaning you can use this, assume it works.
	// @return nothing
	// This method sets your guessingWord to a pre generated lowercase word.
	// This method  is the same as indexOf so no using indexOf.
	public void generateWord(){
		/* implementation not shown */
	}
	
	/** Returns the index of the FIRST same letter in the guessedWord
	 *  @param letter a letter guessed by the user
	 *  @param start, the starting of index of where in the word to start checking
	 *		Preconditions: Assume letter is one single character and lowercase.
	 *	 			Assume start >= 0
	 *  @return index of first same occurrence of letter, returns -1 if no occurrence found.
	 */
	public int guessCheck(String letter, int start){
		int x = 0;
		while (x < guessingWord.length()) {
			if (letter.equals(guessingWord.substring(start))) {
				return start;
			}
			start++;
		}
		
		
		
		
		if (letter == guessingWord.substring(start)) {
			System.out.print(letter);
		} else if ()
	}
	
	/** Returns true if all booleans in the array are true, false otherwise.
	 *  The purpose of this is to check if all letters have been guessed.
	 *	@param boolean array will have true or false values of guessed letters.
	 *		Precondition: arr.length > 0
	 *  @return true if all values are true, false if one or more are false.
	 */
	public boolean checkWin(boolean [] arr){
		// Your code goes here
	}
}


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
			
		
	}
}
