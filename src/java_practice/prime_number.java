package java_practice;

import java.util.Scanner;

public class prime_number {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		int no =sc.nextInt();
		int temp=0;
		
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				
				temp =temp +1;
				
			}
		}
		
		if(temp==0) {
			System.out.println("Given number is prime");
		}
		else {
			System.out.println(" Given number is non-prime ");
		}
	}

}
