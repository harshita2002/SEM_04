package heapmerge;
import java.util.*;


class ArrayEntry {
public Integer value ;
public Integer arrayId;
public ArrayEntry (Integer value, Integer arrayId) {
this. value = value;
this. arrayId = arrayId;
}
}
public class HeapMerge {
	public static List <Integer> mergeSortedArrays (List<List <Integer>> sortedArrays ){
			List <Iterator <Integer>> iters = new ArrayList <>(sortedArrays.size ()) ;
			for (List <Integer> array : sortedArrays) {
			iters.add(array.iterator()) ;
			}
			PriorityQueue <ArrayEntry > minHeap = new PriorityQueue <>(
			(( int) sortedArrays.size ()) , new Comparator <ArrayEntry>() {
			@Override
			public int compare(ArrayEntry o1 , ArrayEntry o2) {
			return Integer.compare (o1.value , o2.value);
			}
			});			
			for (int i = 0; i < iters.size() ; ++i) {
			if (iters.get (i).hasNext()) {
			//System.out.println(iters.get(i).next());
			minHeap.add(new ArrayEntry(iters.get(i).next(), i));
			}
			}

			List <Integer> result = new ArrayList <>() ;
			while (!minHeap.isEmpty ()){
			ArrayEntry headEntry = minHeap.poll() ;
			result.add(headEntry.value) ;
			//System.out.println(headEntry.value);
			
			if (iters.get (headEntry.arrayId).hasNext ()){
			minHeap .add(new ArrayEntry(iters .get(headEntry.arrayId).next() ,
			headEntry.arrayId)) ;
			}
			}
			return result ;
			}

			public static void main(String a[])
			{
				
			List<List<Integer>> arraysList = new ArrayList(); 

			List<Integer> listAtI0 = new ArrayList ();
			List<Integer> listAtI1 = new ArrayList ();
			List<Integer> listAtI2 = new ArrayList ();
			    
			listAtI0.add(3); listAtI0.add(5); listAtI0.add(7); 
			        
			listAtI1.add(0); listAtI1.add(6);
			        
			listAtI2.add(0); listAtI2.add(6);listAtI2.add(28);
			   
			    arraysList.add(listAtI0);
			    arraysList.add(listAtI1);
			    arraysList.add(listAtI2);

				
				List <Integer> res= mergeSortedArrays(arraysList);
				System.out.println(""+res);
			}
}
