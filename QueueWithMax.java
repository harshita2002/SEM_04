package queuewithmax;

import java.util.*;
	public class QueueWithMax<T extends Comparable <T>> {
		//means that the type parameter must support comparison with
		//other instances of its own type, via the Comparable interface
		private Deque<T> entries = new LinkedList<>() ;
		private Deque<T> candidatesForMax = new LinkedList <>() ;
		
		public void enqueue (T x) {
		entries.add (x) ;
		while (! candidatesForMax.isEmpty ()){
			// Eliminate dominated elements in candidatesForMax .
			if (candidatesForMax.getLast().compareTo(x) >= 0) {
				break ;
			}
			candidatesForMax.removeLast() ;
			}
		
		candidatesForMax.addLast(x);
		System.out.println("Deque_element_insertion: "+x);
		}
		
		public T dequeue () {
		if (! entries.isEmpty()) {
		T result = entries.remove() ;
		if(result.equals(candidatesForMax.getFirst())){
		candidatesForMax.removeFirst () ;
		}
		return result;
		}
		throw new NoSuchElementException("Called dequeueQ on empty queue.");
		}

		public T max () {
		if (!candidatesForMax.isEmpty()){
		return candidatesForMax .getFirst();
		}
		throw new NoSuchElementException("empty queue");
		}

		public static void main(String a[])
		{
		  QueueWithMax<Integer> q = new QueueWithMax<>();
		  
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


