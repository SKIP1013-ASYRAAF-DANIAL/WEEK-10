package myArray;

import java.util.*;

public class TestArray2Dimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables for Single Array
		int[] a = new int[5];
		int[] a1 = new int[5];
		
		// Variables for Double Array
		int row = 3;
		int col = 2;
		int data = row*col;
		int[][] b = new int [row][col];
		int sum;
		int totalsum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter " + data + " number/data: ");
		totalsum = 0;
		for(int i=0; i<row; i++) {
			sum = 0;
			for(int j=0; j<col; j++) {
				b[i][j] = input.nextInt();
				sum = sum + b[i][j];
			}
			System.out.println("Sum = " + sum);
			totalsum = totalsum + sum;
			System.out.println("Total Sum = " + totalsum);
		}
		
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				System.out.println("Row :" + i + " " + ", Column :" + j + " = " + b[i][j]);
		
		/*System.out.println("Enter five number for Row a: ");
		for(int i=0; i<a.length; i++)
			a[i] = input.nextInt();
		
		System.out.println("Enter five number for Row a1: ");
		for(int i=0; i<a1.length; i++)
			a1[i] = input.nextInt();
		
		for(int i=0; i<a.length; i++)
			System.out.println("Row a = " + a[i]);
		for(int i=0; i<a.length; i++)
			System.out.println("Row a1 = " + a1[i]);
		*/

	}

}
