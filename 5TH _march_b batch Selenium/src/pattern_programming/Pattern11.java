package pattern_programming;

public class Pattern11 {

	public static void main(String[] args) {
//		    * * * * * *
//         * * * * * *		
//		  * * * * * *
//		 * * * * * *
//		* * * * * *
		
	//row=5; column=6; star=6; space=4
		int star=16; 
		int space=4;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=space; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
		
		

	}

}
