package selfProgramming;

public class EXE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to sum values of an array
		
		int numberArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum;
				
		sum = 0;
				
		for (int i : numberArray) {
			sum += i;	
		}
			System.out.println("The sum is = " + sum);

	}

}
