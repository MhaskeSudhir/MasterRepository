package logical_programming;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("String is "+s);
		
		String rev=" ";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			System.out.println("reverse String is "+rev);
		}
		

		
		Reverse_String rs=new Reverse_String();
		rs.reverseString();
	}
	
	public void reverseString() {
		String name="Vishal";
		
		String rev="";
		
		for(int i=name.length()-1; i>=0; i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.println(rev);
	}

}
