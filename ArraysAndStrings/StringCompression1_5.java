package ArraysAndStrings;

//Compress the string "aabcccccaaa"  to "a2bc5a3"

public class StringCompression1_5 {
	
	private static String compressString(String str){
		
		//Get a string buffer
		StringBuffer sb = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) == last){
				count++;
			}else{
				sb.append(last);
				sb.append(count);
				count = 1;
				last = str.charAt(i);
			}
		}
		sb.append(last);
		sb.append(count);
		
		return sb.toString();
	}
	
	private static String compress(String str){
		//Check if the compressed string is longer --> in this case we need to return the original string
		String result = compressString(str);
		
		if(result.length() > str.length()) return str;
		return result;
	}
	
	public static void main(String[] args) {
		String str = "aabcccccaaa";
		System.out.println(compress(str));
	}

}
