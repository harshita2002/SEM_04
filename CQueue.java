package cqueue;
import java.util.*;

class Queue {
private int head = 0, tail = 0, numQueueElements =0;
private static final int SCALE_FACTOR = 2 ;
private Integer [] entries;
public Queue(int capacity) { entries = new Integer [capacity] ; }

public void enqueue (Integer x) {
if (numQueueElements == entries.length) { // Need to resize.
// Makes the queue elements appear consecutively .
Collections.rotate(Arrays.asList(entries), -head);
System.out.println("head value"+head);
// Resets head and tail.
head = 0;
tail = numQueueElements ;
entries = Arrays.copyOf(entries, numQueueElements * SCALE_FACTOR) ;
//for(int i=0; i<entries.length; i++) {
//System.out.println(entries[i]);	
//}
}
entries [tail] = x;
//System.out.println(entries[tail]);
tail = (tail + 1) % entries.length ;
//System.out.println(tail);
++numQueueElements ;
}

public Integer dequeue () {
if (numQueueElements != 0) {
--numQueueElements;
Integer ret = entries [head];
head = (head + 1) % entries.length ;
//System.out.println(head);
return ret;
}
throw new NoSuchElementException("Dequeue called on an empty queue.");
}
public int size() { return numQueueElements; }
}

public class CQueue
{
public static void main(String[] a)
{
Queue q = new Queue(5);

q.enqueue(7);
q.enqueue(5);
q.enqueue(3);
q.enqueue(3);
System.out.println("Dequeued Element: "+q.dequeue ());
System.out.println("Size of Queue: "+q.size ());
System.out.println("Dequeued Element: "+q.dequeue ());
q.enqueue(13);
q.enqueue(23);
q.enqueue(3);
q.enqueue(3);
System.out.println("Size of Queue: "+q.size ());
System.out.println("Dequeued Element: "+q.dequeue ());
System.out.println("Dequeued Element: "+q.dequeue ());
}
}


