package java_practice;

import java.util.Scanner;

public class first {

	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String:- ");
		String name = sc.next();
		
		for(int i=name.length()-1;i>=0;i--){
			
		char rev = name.charAt(i);
		System.out.print(rev);

		}

		}

}