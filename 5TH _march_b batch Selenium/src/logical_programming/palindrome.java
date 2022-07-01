package logical_programming;

import java.util.Scanner;

public class palindrome {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String actual = sc.next();
	System.out.println(actual);
	
	String rev="";
	
	for(int i=actual.length()-1; i>=0; i--) {
	
		rev=rev+actual.charAt(i);
		
	}
	System.out.println(rev);
	
	if(actual.equals(rev)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("Not palindrome");
	}
	
	
	
	
	
	
	
	
}
}
