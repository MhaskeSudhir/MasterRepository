package logical_programming;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int a = sc.nextInt();
		
		int num=0;
		
		for(int i=a; i>=0; i=i/10) {
			int num1=i%10;
			num=num+(num1*num1*num1);
			
			
			
		}
		if(a==num) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("NOT armstrong number");
		}
		
	}

}
