package selfProgramming;

import java.util.Scanner;

public class Slide27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row;
		int col;  
		double sales[][] = new double[10][5];
		
		Scanner input = new Scanner(System.in);
		
		for (row = 0; row < sales.length; row++) {
		    	for (col = 0; col < sales[row].length; col++)
		    		sales[row][col] = 0.0;
		}
	
		for (row = 0; row < sales.length; row++) {
			for ( col = 0; col < sales[row].length; col++)
				System.out.println(sales[row][col]);
				System.out.println();
		}

	}

}
