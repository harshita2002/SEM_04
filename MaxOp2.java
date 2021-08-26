package stackmaxelement2;
import java.util.*;

class MaxWithCount {
public Integer max;
public Integer count ;
public MaxWithCount(Integer max, Integer count) {
this.max = max ;
this.count = count ;
}
}
class Stack {
private Deque<Integer> element = new LinkedList <>();
private Deque<MaxWithCount> cachedMaxWithCount = new LinkedList <>();
public boolean empty() { return element.isEmpty(); }

public Integer max() {
if(empty()) {
throw new IllegalStateException("max(): empty stack");
}
return cachedMaxWithCount.peekFirst().max ;
}

public Integer pop() {
if(empty()) {
throw new IllegalStateException("pop(): empty stack");
}
Integer popElement = element.removeFirst();
if (popElement.equals(cachedMaxWithCount.peekFirst().max)){
cachedMaxWithCount.peekFirst().count = cachedMaxWithCount.peekFirst().count - 1;
if (cachedMaxWithCount.peekFirst().count.equals(0)){
cachedMaxWithCount.removeFirst();
}
}
return popElement;
}

public void push(Integer x) {
element.addFirst(x);
if (!cachedMaxWithCount.isEmpty()){
if(Integer.compare(x, cachedMaxWithCount.peekFirst().max) == 0) {
cachedMaxWithCount.peekFirst().count = cachedMaxWithCount.peekFirst().count + 1;
} 
else if(Integer.compare(x, cachedMaxWithCount.peekFirst().max) > 0) {
cachedMaxWithCount.addFirst(new MaxWithCount(x, 1));
}
} 
else {
cachedMaxWithCount.addFirst (new MaxWithCount (x , 1));
}
}
}

public class MaxOp2 {
	public static void main(String []a)
	{
	Stack st = new Stack();
	st.push(5);
	st.push(16);
	st.push(16);
	st.push(8);
	st.push(17);
	System.out.println("Max element in the stack: "+st.max());
	System.out.println("Pop operation: "+st.pop());
	System.out.println("Max element in the stack: "+st.max());
	}
}
