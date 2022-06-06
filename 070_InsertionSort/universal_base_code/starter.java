import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Sort {
	
	public void insertionSort(int arr[], int n) {
	int i;
	int x;
	int j;
	
	for (i = 1; i < n; i++) {
		x = arr[i];
		j = i - 1;
		
		 while (j >= 0 && arr[j] > x) {
		 	arr[j + 1] = arr[j];
		 	j = j - 1;
		 }
		 arr[j+1] = x;
	}
}
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
	Sort.insertionSort(200, 200);
		
	}
}
