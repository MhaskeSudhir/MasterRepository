package logical_programming;

public class FactorialNumber {

	public static void main(String[] args) {
		int a=3;
		int fact=1;
		
		for(int i=a; i>=1; i--) {
			fact=fact*i;
		}
		System.out.println("facrorial of a is "+fact);

	}

}
