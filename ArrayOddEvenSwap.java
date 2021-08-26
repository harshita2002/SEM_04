import java.util.*;
public class ArrayOddEvenSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		ArrayList arr=new ArrayList(n);
		int i=0,j=0;
		for(i=0;i<n;++i)
		{
			arr.add(i, s.nextInt());
		}
		for(i=0;i<n;++i)
		{
			for(j=i+1;j<n;++j)
			{
				int a=Integer.parseInt(arr.get(i).toString());
				
			}
		}

	}

}
