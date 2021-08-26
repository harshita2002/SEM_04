import java.util.Scanner;
import java.util.ArrayList;
public class AListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		ArrayList arr=new ArrayList(n);
		int i,e;
		for(i=0;i<n;++i)
		{
			e=s.nextInt();
			arr.add(e);
		}
		//reversing the arrayList
		/*ArrayList arr2=new ArrayList(n);
		for(i=n-1;i>=0;--i)
		{
			arr2.add(arr.get(i));
		}*/
		for(i=0;i<n/2;++i)
		{
			int e1=Integer.parseInt(arr.get(i).toString());
			int e2=Integer.parseInt(arr.get(n-i-1).toString());
			arr.set(i, e2);
			arr.set(n-1-i, e1);
			
		}
			
		for(i=0;i<n;++i)
		System.out.println(arr.get(i));

	}

}
