
package ArraysAndStrings;

//Implement an algorithm to determine if a string has all unique characters. Space - O(n), Time - (n)

public class UniqueCharacters1_1 {
	
	public static boolean isUnique(String str){
		if(str.length() > 128) return false;
		
		boolean[] set = new boolean[256];
		
		for(int i = 0; i < str.length(); i++){
			if(set[str.charAt(i)] == true){
				return false;
			}
			set[str.charAt(i)] = true;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "Chandan";
		String str2 = "singh";
		
		System.out.println(isUnique(str));
		System.out.println(isUnique(str2));
	}

}
