import java.util.*;
public class AlistEvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		int i;
		for(i=0;i<n;++i)
			arr.add(s.nextInt());
		int ne=0,no=n-1;
		i=0;
		while (ne!=no)	
		{
			if(arr.get(i)%2==0)
			{
				ne++;
			}
			else
			{
				Collections.swap(arr, ne, no);
				no--;
			}
		}
		for(i=0;i<n;++i)
		{
			System.out.print(arr.get(i)+" ");
		}
			

	}

}
