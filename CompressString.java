
public class CompressString {
	
	public static String compressString(String str){
		int size = stringLength(str);
		if(size >= str.length()){
			return str;
		}
		
		StringBuffer sb = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for(int i = 1; i < str.length(); i++){
			if(last == str.charAt(i)){
				count++;
			}else{
				sb.append(last);
				sb.append(count);
				last = str.charAt(i);
				count = 1;
			}
		}
		
		sb.append(last);
		sb.append(count);
		return sb.toString();
	}
	
	public static int stringLength(String str){
		if(str == null || str.isEmpty()){
			return 0;
		}
		
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		
		for(int i = 1 ;  i < str.length(); i++){
			if(str.charAt(i) == last){
				count++;
			}else{
				last = str.charAt(i);
				size += 1 + str.valueOf(count).length();
				count = 1;
						
			}
		}
		
		size += 1 + String.valueOf(count).length();
		return size;
	}

	public static void main(String[] args) {
		String str = "aabcccccaaa";
		String ans = compressString(str);
		System.out.println(ans);
	}
}
