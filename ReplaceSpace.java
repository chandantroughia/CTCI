
public class ReplaceSpace {


	
	public static void replaceSpace(String input, int length) {

	    char[] str = input.toCharArray();

	    int spaceCount = 0;
	    for(int i = length - 1; i >= 0; i--){
	        if(str[i] == ' ') {
	            spaceCount++;
	        }
	    }

	    int newLength = length + spaceCount * 2;

	    str[newLength] = '\0';

	    for(int i = length - 1; i >= 0; i--) {
	        if(str[i] == ' ') {
	            str[newLength] = '0';
	            str[newLength - 1] = '2';
	            str[newLength - 2] = '%';
	            newLength = newLength - 2;
	            System.out.println(str);
	        } else {
	            str[newLength - 1] = str[i];
	            newLength = newLength - 1;
	            System.out.println(str);
	        }
	    }
	}
	
	
	
	public static void main(String[] args) {
		
		String str = "Hello my name is Chandan";
		//char[] arr = str.toCharArray();
		int length = str.length();
		System.out.println(length);
		replaceSpace(str, length);
		System.out.println(str);
	}
}
