package logical_programming;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String str="@3#1254%@Velocity*%$";
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

	}

}
