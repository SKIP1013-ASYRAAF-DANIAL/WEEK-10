package selfProgramming;

import java.util.*;

public class EXE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to sort a numeric array and a string array
				int[] numberArray = { 
						100, 210, 345, 888,
						541, 930, 311, 22,
						945, 1000, 783, 998 };
				
				String[] nameArray = {"TNB", "MAS", "TRADEWINDS", "PROTON", "PETRONAS", "SIMEDARBY", "GRANTT", "BSN", "TM", "MISC", "YAB"};
				
				System.out.println("Original numeric array : " + Arrays.toString(numberArray));
			    	Arrays.sort(numberArray);
			    	System.out.println("Sorted numeric array : " + Arrays.toString(numberArray));
			    
			    	System.out.println("Original string array : " + Arrays.toString(nameArray));
			    	Arrays.sort(nameArray);
			    	System.out.println("Sorted string array : " + Arrays.toString(nameArray)); 


	}

}
