package pattern_programming;

public class Pattern10 {

	public static void main(String[] args) {
//		*        *
//		**      **
//		***    ***
//		****  ****
//		**********
//		****  ****
//		***    ***
//		**      **
//		**       *
		//row=9; column=10
		//left side----..star=1; space=4
		//right side------star=1; space=4
		
		int space1=4;
		int star1=1;
		
		int space2=4;
		int star2=1;
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=star1; j++) {
				System.out.print("*");
			}
			for(int k=1; k<=space1; k++) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=space2; j++) {
				System.out.print(" ");
				
			}
			for( int k=1; k<=star2; k++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i<5) {
				star1++;
				space1--;
				star2++;
				space2--;
			}
			else {
				star1--;
				space1++;
				star2--;
				space2++;
			}
			
		}

	}

}
