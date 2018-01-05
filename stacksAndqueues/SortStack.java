package stacksAndqueues;

import java.util.Stack;

/* write a program to sort a stack in ascending order (with biggest items on top).
 * you may use at most one additional stack to hold items, but you may not copy the
 * elements into any other data strcuture (such as an array). The stack supports the
 * folowing operations: push, pop, peek, and isEmpty */

public class SortStack {
	
	public Stack<Integer> sort(Stack<Integer> theStack){
		Stack<Integer> result = new Stack<Integer>();
		
		while(!theStack.isEmpty()){
			int temp = theStack.pop();
			//if result is not empty and if the top most element in result is greater to temp then we push it the original stack
			while(!result.isEmpty() && result.peek() > temp){
				theStack.push(result.pop());
			}
			result.push(temp);
		}
		//finally result will have all the sorted elements
		return result;
	}
}
