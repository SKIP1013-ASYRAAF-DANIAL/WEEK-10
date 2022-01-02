package selfProgramming;

public class EXE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to calculate the average value of array elements
		
		int[] integer = new int[] {-104, 13, 150, -4, 69, -22, 45, -15, 8};
		int sum; 
		double average; 
				
		// Calculate sum of all array elements
		sum = 0;
		for (int i = 0; i < integer.length; i++) {
			sum = sum + integer[i];
		}
		
		// Calculate average value
		average = sum / integer.length;
		System.out.println("The sum is = " + sum); 
		System.out.println("The average is = " + average); 

	}

}
