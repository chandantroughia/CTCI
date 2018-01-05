package ArraysAndStrings;

import java.util.Arrays;

//Given two strings check if one the permutation of the other

public class IsPermutation1_3 {
	
	//Using character counts
	public static boolean isPermutation(String s, String t){
		if(s.length() != t.length()) return false;
		//if(s == null && t == null) return true;
		
		s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		t = t.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		int[] chars = new int[26];
		
		for(int i = 0; i < s.length(); i++){
			chars[s.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < t.length(); i++){
			chars[t.charAt(i) - 'a']--;
		}
		
		for(Integer I: chars){
			if(I > 0){
				return false;
			}
		}
		return true;
	}

	//Using sort
	
	public static String sort(String s){
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	
	public static boolean usingSort(String s, String t){
		if(s.length() != t.length()) return false;
		return sort(s).equals(sort(t));
	}
	
	public static void main(String[] args) {
		String s = "cat";
		String t = "act";
		
		System.out.println(isPermutation(s, t));
		System.out.println(usingSort(s, t));
	}
}
