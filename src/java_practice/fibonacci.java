package java_practice;

import java.util.Scanner;

public class fibonacci {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number:- ");
	
	int nu=(sc.nextInt()-2);
	
	
	int a=0,b=1;
	
	System.out.print(a+" ");
	System.out.print(b);
	for(int i=1;i<=nu;i++) {
		int c;
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		
		
	}
}
}
