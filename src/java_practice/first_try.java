package java_practice;

import java.util.Scanner;

public class first_try {
	
	
	public static void main (String [] arges) {
		
		
		Scanner sc = new Scanner (System.in);
	
		System.out.println("enter the no. ");
		
		int no =sc.nextInt();
		
		if (no%2==0) 
			System.out.println("The given no. "+no+" is evan");
		else
				System.out.println("The given no. is odd");
		
		
	}
	
}
