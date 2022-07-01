package logical_programming;

import java.util.Scanner;

public class EvenOddNumbers {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");
		}
	}

}
