package pattern_programming;

public class Triangel3 {

	public static void main(String[] args) {
		 

		
		//row=5; column=5;  star=5;

		int star=5;
		int space=0;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=star; k++) {
				System.out.print("* ");
			}
			System.out.println();
		
			star--;
			space++;
			
		}
		
		
		
	}

}
