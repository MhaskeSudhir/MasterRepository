package pattern_programming;

public class Triangle4 {

	public static void main(String[] args) {
		//row=5    column=5   star=1   space=4
		
		int space=4;
		int star=1;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=star; k++) {
				System.out.print(" *");
			}
			System.out.println();
			space--;
			star++;
		}
		
		

	}

}
