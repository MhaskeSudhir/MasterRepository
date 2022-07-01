package logical_programming;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		String str=" P U N E ";
		int count=0;
		
		for(int i=0; i<=str.length()-1; i++) {
			char space=' ';
			char mychar=str.charAt(i);
			
			if(mychar==space) {
				count++;			}
			
		}
		System.out.println("NUmber of white space is "+count);
		

	}

}
