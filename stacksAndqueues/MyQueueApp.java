package stacksAndqueues;

public class MyQueueApp {
	public static void main(String[] args) {
		MyQueue theQueue = new MyQueue();
		theQueue.add(1);
		theQueue.add(2);
		theQueue.add(3);
		
		System.out.print(theQueue.remove() + " ");
		System.out.print(theQueue.remove() + " ");
		System.out.print(theQueue.remove() + " ");
		theQueue.add(4);
		theQueue.add(5);
		System.out.print(theQueue.remove() + " ");
		System.out.print(theQueue.remove() + " ");
	}

}
