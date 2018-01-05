package stacksAndqueues;

import java.util.Stack;

//implement a queue using two stacks (assuming the values to be pushed are integers)
//we will make the peek and pop operations more expensive in order to do so.
public class MyQueue {
	Stack<Integer> first, second;
	
	public MyQueue(){
		this.first = new Stack<Integer>();
		this.second = new Stack<Integer>();
	}
	
	public int size(){
		return first.size() + second.size();
	}
	
	//add the new element in the first stack
	public void add(int value){
		first.push(value);
	}
	
	//now
	public int remove(){
		shiftStacks(); // --> this function will pop values from first stack and push them to second stack before removing
		return second.pop();
	}
	
	public int peek(){
		shiftStacks(); // --> this function will pop values from first stack and push them to second stack before removing
		return second.peek();
	}
	
	private void shiftStacks(){
		if(second.isEmpty()){
			while(!first.isEmpty()){
				second.push(first.pop());
			}
		}
	}
}
