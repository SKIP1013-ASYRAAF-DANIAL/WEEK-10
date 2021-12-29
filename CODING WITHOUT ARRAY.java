package myArray;

import java.util.*;

public class WithoutArray_TraditionalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name0, name1, name2, name3, name4;
	    int item0, item1, item2, item3, item4;
	    int sum;
		
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Enter five customers name:");
	    
	    name0 = input.next();
	    name1 = input.next();
	    name2 = input.next();
	    name3 = input.next();
	    name4 = input.next();
	    
	    System.out.println("Customers name in reverse order are:");
	    System.out.println(name4 + " " + name3 + " " + name2 + " " + name1 + " " + name0);
	    System.out.println();
	    
	    System.out.println("Enter five integers one number per line:");
	        
	    item0 = input.nextInt();
	    item1 = input.nextInt();     
	    item2 = input.nextInt();
	    item3 = input.nextInt();
	    item4 = input.nextInt();
	        
	    sum = item0 + item1 + item2 + item3 + item4;
	        
	    System.out.println("The sum of the numbers = " + sum);
	    System.out.println("The numbers in reverse order are: ");
	    System.out.println(item4 + " " + item3 + " " + item2 + " " + item1 + " " + item0);


	}

}
