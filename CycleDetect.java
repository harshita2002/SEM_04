package listcycledetect;
import java.io.*;

class ListNode<T> {
public T data;
public ListNode<T> next;

ListNode(T ob1, ListNode<T> ob2)
{
this.data = ob1;
this.next = ob2;
}
}
public class CycleDetect {
	public static void main(String aa[])
	{
	ListNode <Integer> L1 = new ListNode<Integer>(1 , null);
	ListNode <Integer> in = L1;
	for(int i=0; i<10; i++){
	ListNode <Integer> newNode = new ListNode<Integer>(i+4 , null);
	insertAfter(in, newNode);
	in = newNode;
	}

	in.next = L1.next.next.next;
	ListNode <Integer> p = hasCycle(L1);

	if(p==null)
	System.out.println("No Cycle");
	else{
	System.out.println("Cycle Detected");
	
	ListNode <Integer> p1=p;
	do{
	System.out.println(p.data);
	p = p.next;
	}
	while(p!=p1);
	}
	}
	public static void insertAfter(ListNode <Integer> node,
	ListNode <Integer> newNode) {
	newNode.next = node.next;
	node.next = newNode;
	}
	public static ListNode <Integer> hasCycle(ListNode <Integer> head) {
	ListNode <Integer> fast = head, slow = head;
	while (fast != null && fast. next != null) {
	slow = slow.next;
	fast = fast.next.next ;
	if (slow == fast) {
	// There is a cycle, so now let’s calculate the cycle length.
	int cycleLen = 0;
	do {
	++cycleLen;
	fast = fast.next ;
	} while (slow !=fast);
	System.out.println("Cycle length: "+cycleLen);
	// Finds the start of the cycle.
	ListNode <Integer> cycleLenAdvancedIter = head;
	// cycleLenAdvancedlter pointer advances cycleLen first.
	while (cycleLen-- > 0) {
	cycleLenAdvancedIter = cycleLenAdvancedIter.next ;
	}
	ListNode <Integer> iter = head;
	// Both iterators advance in tandem.
	while (iter != cycleLenAdvancedIter) {
	iter = iter.next ;
	cycleLenAdvancedIter = cycleLenAdvancedIter.next ;
	}
	System.out.println("The start of cycle at node value: "+iter.data);
	return iter; // iter is the start of cycle.
	}
	}
	return null; // no cycle.
	}

}
