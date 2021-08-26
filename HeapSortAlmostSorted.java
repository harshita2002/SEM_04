package heapsortalmostsorted;
import java.util.*;

public class HeapSortAlmostSorted {
	
	public static void sortApproximatelySortedData(Iterator <Integer> sequence, int k) {
		PriorityQueue <Integer > minHeap = new PriorityQueue <>() ;
		// Adds the first k elements into minHeap. Stop if there are fewer than k
		// elements .
		for (int i = 0; i < k && sequence . hasNext () ; ++i) {
		minHeap . add(sequence .next ()) ;
		}
		// For every new element, add it to minHeap and extract the smallest.
		while (sequence . hasNext () ) {
		minHeap . add ( sequence . next () ) ;
		Integer smallest = minHeap . remove () ;
		System.out.println( smallest) ;
		}
		// sequence is exhausted, iteratively extracts the remaining elements.
		while (!minHeap.isEmpty () ) {
		Integer smallest = minHeap.remove () ;
		System.out.println( smallest) ;
		}
		}

		public static void main(String a[])
		{
			// <3, -1,2,6,4, 5, 8> k=2
			ArrayList<Integer> seq = new ArrayList<Integer>();
		    seq.add(3);
		    seq.add(-1);
		    seq.add(2);
		    seq.add(6);
		    seq.add(4);
		    seq.add(5);
		    seq.add(8);
		    
		Iterator <Integer> sequence = seq.iterator();
			sortApproximatelySortedData(sequence, 2);
			
			
		}

}
