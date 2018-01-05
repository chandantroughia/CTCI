package stacksAndqueues;

import java.util.Stack;

public class StackWithMin {

	Stack<Node> theStack = new Stack<>();
	
	public class Node{
		int value;
		int min;
		
		public Node(int value, int min){
			this.min = min;
			this.value = value;
		}
	}
	
	
	public void push(int value){
		if(theStack.isEmpty()){
			theStack.push(new Node(value, value));
		}else{
			theStack.push(new Node(value, Math.min(value, min())));
		}
	}
	
	public void pop(){
		theStack.pop();
	}
	
	public int min(){
		if(!theStack.isEmpty()){
			return theStack.peek().min;
		}
		return -1;
	}
	
	
}


