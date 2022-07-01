package logical_programming;

public class ReverseMiddleString {

	public static void main(String[] args) {
		String str="ABC PQR XYZ";
		
		String subString = str.substring(4, 7);
		System.out.println(subString);
		
		String rev="";
		
		for(int i=subString.length()-1; i>=0; i--) {
			rev=rev+subString.charAt(i);
		}
		System.out.println(rev);

	}

}
