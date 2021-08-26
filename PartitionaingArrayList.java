import java.util.*;
public class PartitionaingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		int i;
		for (i=0;i<n;++i)
		{
			//System.out.println("Enter an element");
			arr.add(s.nextInt());
		}
		i=-1;
		int piv=n-1,j;
		for( j=0;j<n-1;++i)
		{
			if(arr.get(j)<arr.get(piv))
			{
				++i;
				Collections.swap(arr, i, j);
			}
		}
		Collections.swap(arr, piv, j);
System.out.println(arr);
	}

}
