package stackmaxelement;
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
	// Stores (element , cached maximum) pair.
	private Deque<ElementWithCachedMax > elementWithCachedMax = new LinkedList <>();
	public boolean empty() { return elementWithCachedMax.isEmpty();}
	
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

	public class MaxOp{
	public static void main(String []a)
	{
	Stack st = new Stack();
	st.push(10);
	st.push(16);
	st.push(17);
	st.push(23);
	System.out.println("Max element in the stack: "+st.max());
	System.out.println("Pop operation: "+st.pop());
	System.out.println("Max element in the stack: "+st.max());
	}
}

