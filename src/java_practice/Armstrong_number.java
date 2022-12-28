package java_practice;

import java.util.Scanner;

public class Armstrong_number {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		int or=sc.nextInt();
		
		int no =153;
		
		int t1=no;
		int len=0;
		
		while(t1!=0) {
			len=len+1;
			t1=t1/10;
	    }
		
		int t2=no;
		int rem=0;
		while(t2!=0) {
			
			int one=t2%10;
			int mul=1;
			for(int i=1;i<=len;i++) {
		     	 mul=mul*one;
			}
			rem=rem+mul;
			t2=t2/10;
		}
		
		if(or==rem) {
			System.out.println("This is armstrong number:"+rem);
		}
		else {
			System.out.println("This is not a armstrong number:"+rem);
		}
		
	}

}
