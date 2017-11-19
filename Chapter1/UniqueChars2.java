/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author chandantroughia
 */
public class UniqueChars2 {
	
	private static boolean isUniqueChar2(String str) {
		
		if(str.length() > 128){
			return false;
		}
		
		boolean[] char_set = new boolean[256];
		for(int i = 0; i < str.length(); i++){
			int ch = str.charAt(i);
			if(char_set[ch] == true){
				return false;
			}
			char_set[ch] = true;
		}
		
		return true;

	}
    
    public static void main(String[] args){
        String str = "chandan";
        String str2 = "Ayush$";
        
        System.out.println(isUniqueChar2(str));
        System.out.println(isUniqueChar2(str2));
        
    }
    
}
