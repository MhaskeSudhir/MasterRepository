package logical_programming;

public class Reverse_Middle_String {

	public static void main(String[] args) {
		String str="ABC PQR XYZ";
		String [] ar=str.split(" ");
		//System.out.println(str);
		//index of ABC----->0
		//index of PQR----->1
		//index of XYZ------>2
		
		
		
		for(int i=0; i<=ar.length-1; i++) {
			
			if(i%2==0) {
				 String s = ar[i];
//				ar[i]=Reversse_String(s);
//				System.out.print(ar[i]+" ");
				System.out.print(Reversse_String(s)+" ");
			
			}
			else {
				System.out.print(ar[i]+" ");
			}
		}
			
			
	//	}
		

	}
	
	
	public static String Reversse_String(String input) {
		String rev="";


		for(int i=input.length()-1; i>=0; i--) {
			rev=rev+input.charAt(i);
		}
		return rev;
	}

}
