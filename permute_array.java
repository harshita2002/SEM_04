import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class permute_array 
{
	public static void arrayPermutation(List <Integer> perm, List<Integer> A)
	{
		for(int i=0;i<A.size();i++)
		{
			int next=i;
			while(perm.get(next)>=0)
			{
				Collections.swap(A,i,perm.get(next));
				int temp=perm.get(next);
				perm.set(next,perm.get(next)-perm.size());
				next=temp;
			}
		}
		for(int i=0;i<perm.size();i++)
		{
			perm.set(i,perm.get(i)+perm.size());
		}
		System.out.println("Permutation Array: "+perm);
		System.out.println("Result Array: "+A);
	}
	static List<Integer> list=new ArrayList<Integer>();
	static List<Integer> x=new ArrayList<Integer>();
	public static void main(String[] args) 
	{
		list.add(3);
		list.add(2);
		list.add(0);
		list.add(1);
		x.add(5);
		x.add(6);
		x.add(7);
		x.add(8);
		System.out.println("Given Array: "+x);
		arrayPermutation(list,x);
	}
}
