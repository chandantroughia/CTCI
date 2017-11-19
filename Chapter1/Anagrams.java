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
public class Anagrams {
    
    private static boolean isAnagram(String a, String b){
        
        a = a.replaceAll("[^\\p{Alnum}]", "").toLowerCase();
	b = b.replaceAll("[^\\p{Alnum}]", "").toLowerCase();
        
        if(a.length() != b.length()){
            return false;
        }
        
        int[] letters = new int[256];
        
        for(char c: a.toCharArray()){
            letters[c]++;
        }
        
        for(char c: b.toCharArray()){
            letters[c]--;
        }
        
        for(int i: letters){
            if(i != 0){
                return false;
            }
        }
        
        return true;
    }
    
    
    public static void main(String[] args){
        System.out.println(isAnagram("abcd","dcab"));
        System.out.println(isAnagram("abcdt","dcabf"));
        
    }
    
}
