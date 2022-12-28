package java_practice;

import java.util.Scanner;

public class re_duplicate_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String given=sc.next();
		
		String sorted= "";
		
		for(int i=0;i<given.length();i++) {
			char singal=given.charAt(i);
			
			if(singal!=' ') {
				
				sorted= sorted+singal;
				given=given.replace(singal, ' ');
			}
			
			
			
		}
		System.out.println(sorted);
	}
}
