package myArray;

import java.util.*;

public class ReverseOrder {
	
    public static void main(String [] args) {
    // TODO Auto-generated method stub
    
    int [] item = new int [5];
    String [] name = new String [5];
    int [][] sales = new int [3][3];
    int sum = 0;
    
    Scanner input = new Scanner(System.in);
    
    // Example 1
    item[2] = 5;
    item[4] = 7;
    item[1] = item[2] + item [4];
    for (int i=0; i<item.length; i++)
    	System.out.println("Items are: " + "Index " + i + " = " + item[i]);
    System.out.println();
    
    // Example 2
    System.out.println("Enter five integers one number per line:");
    for (int i=0; i<item.length; i++) {
    	item[i] = input.nextInt();
    	sum = sum + item[i];
    }
    for (int i=0; i<item.length; i++) {
    	System.out.println("Items are: " + "Index " + i + " = " + item[i]);
    }
    System.out.println("The sum is " + sum);
    System.out.println("The average is " + sum/item.length);
    System.out.println();
    
    // Example 3
    System.out.println("Enter five customers name: ");
    for (int i=0; i<name.length; i++) {
    	name[i] = input.next();
    }
    for (int i=0; i<name.length; i++) {
    	System.out.println("Name is: " + "Index " + i + " = " + name[i]);
    }
    System.out.println();
    
    // Example 4
    System.out.println("Enter sales per line: ");
    for (int i=0; i<sales.length; i++) {
    	for (int y=0; y<sales.length; y++) {
    		sales [i][y] = input.nextInt();
    		sum = sum + sales [i][y];
    	}
    }
    
    for (int i=0; i<sales.length; i++) {
    	for (int y=0; y<sales.length; y++) {
    		System.out.println("i = " + i + " y = " + y);
    		System.out.println("Value for sales is: " + sales[i][y]);
    	}
    }
    int avg = sum/sales.length;
    System.out.println("The sum of sales is: " + sum);
    System.out.println("The average of sales is: " + avg);
    System.out.println();
    

    }
}
