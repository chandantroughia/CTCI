package Chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Temp {
	
	private static int getDone(int[] nums) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        ArrayList<Integer> theList = new ArrayList<Integer>(set);
        Collections.sort(theList);
        
        System.out.println(theList);
        if(theList.size() == 1){
            return theList.get(0);
        }
        else if(theList.size() == 2){
            return theList.get(theList.size() - 1);
        }
        else{
            return theList.get(theList.size() - 3);
        }
        
	}

	public static void main(String[] args) {
		int[] n = {1,2};
		System.out.println(getDone(n));
	}
}
