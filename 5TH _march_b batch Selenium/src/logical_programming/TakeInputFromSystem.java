package logical_programming;

import java.util.Scanner;

public class TakeInputFromSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Sum of a and b is "+sum);
		
		TakeInputFromSystem ip=new TakeInputFromSystem();
		ip.StringMethod();

	}
	
	public void StringMethod() {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String main = sc.next();
		System.out.println(sc.nextInt());
		System.out.println(name.concat(main));
	}

}
