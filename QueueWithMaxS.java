package queuewithmaxs;

import java.util.*;

class ElementWithCachedMax {
public Integer element;
public Integer max;
public ElementWithCachedMax(Integer element, Integer max) {
this.element = element;
this.max = max ;
}
}
class Stack {
//Stores (element , cached maximum) pair.
private Deque<ElementWithCachedMax > elementWithCachedMax = new LinkedList <>();
public boolean empty() { return elementWithCachedMax.isEmpty (); }

public Integer max() {
if (empty()){
throw new IllegalStateException("max (): empty stack");
}
return elementWithCachedMax.peek().max ;
}

public Integer pop() {
if (empty()){
throw new IllegalStateException("pop (): empty stack");
}
return elementWithCachedMax.removeFirst().element ;
}

public void push(Integer x) {
elementWithCachedMax.addFirst(
new ElementWithCachedMax(x , Math.max(x, empty() ? x : max())));
}
}

class QueueWithMax {
private Stack enqueue =new Stack() ;
private Stack dequeue = new Stack() ;
public void enqueue (Integer x) { enqueue.push(x); }

public Integer dequeue() {
	if (dequeue.empty()) {
		while (!enqueue.empty()){
			dequeue.push(enqueue.pop()) ;
		}
	}
	if (!dequeue.empty()){
		return dequeue.pop() ;
	}
	throw new NoSuchElementException("Cannot get dequeue () on empty queue.");
	}

public Integer max() {
	if (! enqueue.empty()){
		return dequeue.empty () ? enqueue.max() : Math.max(enqueue. max(), dequeue.max ());
	}
	if (! dequeue.empty ()){
		return dequeue.max ();
	}
	throw new NoSuchElementException("Cannot get max () on empty queue.");
	}
}



public class QueueWithMaxS {
	
	public static void main(String a[])
	{
	  QueueWithMax q = new QueueWithMax();
	  
	  
	  q.enqueue(3);q.enqueue(1);q.enqueue(3);q.enqueue(2);
	  q.enqueue(0);
	  
	  System.out.println("Max element: "+q.max());
	  q.enqueue(1);
	  System.out.println("Dequeued element: "+q.dequeue());
	  System.out.println("Dequeued element: "+q.dequeue());
	   System.out.println("Max element: "+q.max());
	   q.enqueue(2);
	   q.enqueue(4);
	   System.out.println("Dequeued element: "+q.dequeue());
	  System.out.println("Max element: "+q.max());
	  q.enqueue(4);

	}

}
