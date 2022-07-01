package logical_programming;

public class Primenumber {

	public static void main(String[] args) {
		int input=10;
		int count=0;
		
		for(int i=2; i<input; i++ ) {
			
			if(input%i==0) {
				count++;
			}
			}
			
			if(count==0) {
				System.out.println("prime number");
			}
			
			else {
				System.out.println("Not a prime number");
			}
		
		

	}

}
