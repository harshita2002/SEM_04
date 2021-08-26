import java.util.*;
public class AlistSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList arr=new ArrayList(n);
		int i;
		for(i=0;i<n;++i)
		{
			arr.add(s.nextInt());
		}
		for(i=0;i<n-1;++i)
		{
			if(Integer.parseInt(arr.get(i).toString())>Integer.parseInt(arr.get(i+1).toString()))
			Collections.swap(arr, i, i+1);
		}
		for(i=0;i<n;++i)
		{
			System.out.println(arr.get(i));
		}
			
	}

}
