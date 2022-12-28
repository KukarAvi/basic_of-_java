package java_practice;
import java.util.Scanner;
public class practice_all {
	public static void main(String[] args) {
		
		int no =1234;
		int sa ;
		int store=0;
		
		for (int i=1;i<=4;i++) {
			
			store=no%10;
			no=no/10;
			
			//System.out.print(store);
			
		}
		System.out.print(store);
	}
}
