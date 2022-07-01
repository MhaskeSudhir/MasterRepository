package logical_programming;

public class ReverseNumber {

	public static void main(String[] args) {
		int a=12345;
		
		String A=Integer.toString(a);
		String rev="";
		
		for(int i=A.length()-1; i>=0; i--) {
		
			rev=rev+A.charAt(i);
		}
		System.out.println(rev);
		
		int aA = Integer.parseInt(rev);
		
		System.out.println(aA);
		
		

	}

}
