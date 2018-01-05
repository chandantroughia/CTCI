package ArraysAndStrings;

//Replace all the spaces in the string with '%20'

public class ReplaceSpaces1_4 {
	
	public static void replaceSpaces(char[] str, int len){
		int spaces = 0, newLen, i;
		
		//Get the count of the spaces
		for(i = 0; i < len; i++){
			if(str[i] == ' '){
				spaces++;
			}
		}
		
		newLen = len + spaces * 2;
		
		str[newLen] = '\0';
		
		//Start at the end of the string
		for(i = len - 1; i >= 0; i--){
			if(str[i] == ' '){
				str[newLen - 1] = '0';
				str[newLen - 2] = '2';
				str[newLen - 3] = '%';
				newLen = newLen - 3;
			}else{
				str[newLen - 1] = str[i];
				newLen = newLen - 1;
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "Happy new year!";
		
		replaceSpaces(str.toCharArray(), str.length());
		
		System.out.println(str);
	}

}
