package logical_programming;

import java.util.HashMap;
import java.util.Set;

public class RepeatatingCharInStringUsingMap {

	public static void main(String[] args) {
		String str="abcabcabc";
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0; i<=str.length()-1; i++) {
			
			char charvalue = str.charAt(i);
			
			if(map.containsKey(charvalue)) {
				map.put(charvalue, map.get(charvalue)+1);
			}
			else {
				map.put(charvalue,1);
			}
		}
		System.out.println(map);
		
		Set<Character> keys = map.keySet();
		
		for(Character key:keys) {
			System.out.println(key+" "+ map.get(key));
		}

	}

}
