package selfProgramming;

import java.util.Scanner;

public class Slide25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nameList = {"Amanda Green", "Vijay Arora", "Sheila Mann", "Rohit Sharma", "Mandy Johnson"};
		// OR String[] nameList = new String[5];
 		
		Scanner input = new Scanner(System.in);
		    
		System.out.println("Enter five participants");
		 
		for(int i = 0; i < nameList.length; i++) {
			System.out.println("Participants name are : " + "person " + i + " = " + nameList[i]);
		}

	}

}
