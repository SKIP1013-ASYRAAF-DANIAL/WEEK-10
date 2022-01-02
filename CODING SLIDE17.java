package selfProgramming;

import java.util.Scanner;

public class Slide17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] sales = new double[10];
		int index, maxIndex;
		double sum, average, largestSale;
		
		sum = 0;
		maxIndex = 0;

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter sales");
		
		// Initializing an array to a specific value
		for (index = 0; index < sales.length; index++) {
			sales[index] = 10.00;
		}
		
		// Input data into an array
		for (index = 0; index < sales.length; index++) {
			sales[index] = input.nextDouble();
		}
	
		// Printing an array
		System.out.print("Sales are : ");
		for (index = 0; index < sales.length; index++) {
			System.out.print(sales[index] + " ");
		}
		
		// Find the sum and average of an array
		for (index = 0; index < sales.length; index++) { 
			sum = sum + sales[index];
		}
		System.out.printf("\nThe sum of sales is = %.2f", sum);

		if (sales.length != 0) {
		    average = sum / sales.length;
		} else {
		    average = 0.0;
		}
		System.out.printf("\nThe average of sales is = %.2f", average);
		
		System.out.println();
		
		// Determining the largest element in the array
		for (index = 1; index < sales.length; index++) 
			if (sales[maxIndex] < sales[index]) {
				maxIndex = index;
				largestSale = sales[maxIndex];
				System.out.println("The largest of the sales is = " + sales[maxIndex]);
				System.out.println("The maxIndex is = " + index);
		}
	}
}
