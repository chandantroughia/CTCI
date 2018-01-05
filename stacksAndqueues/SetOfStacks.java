package stacksAndqueues;

import java.util.ArrayList;
import java.util.Stack;

/* imagine a (literal) stack of plates. If the stack gets too high, it might topple.
 * Therefore, in real life, we would likely start a new stack when the previous stack
 * exceeds some threshold. Implement a data structure SetOfStacks that mimics this.
 * SetOfStacks should be composed of several stacks and should create a new stack once
 * the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should
 * behave identically to a single stack (that is, pop() should return the same values as
 * it would if there were just a single stack) */

public class SetOfStacks {

	ArrayList<Stack<Integer>> theStack = new ArrayList<>();
	
	public void push(int value){
		Stack lastStack = getLastStack();
		if(lastStack != null && !isFull(lastStack)){
			lastStack.push(value);
		}
		else{
			Stack<Integer> newStack = new Stack<Integer>();
			newStack.push(value);
			theStack.add(newStack);
		}
	}
	
	public int pop(){
		Stack lastStack = getLastStack();
		int value = (int) lastStack.pop();
		if(lastStack.isEmpty()){
			theStack.remove(theStack.size() - 1);
		}
		return value;
	}
	
	private Stack getLastStack(){
		return theStack.get(theStack.size() - 1);
	}
	
	//lets assume our stack size doesn't exceed 10
	private boolean isFull(Stack<Integer> lastStack){
		return lastStack.size() == 10;
	}
	
}
