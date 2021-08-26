import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DutchProblemUnknownCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		for(int i=0;i<n;++i)
		{
			a.add(ss.nextInt());
		}
		int mid=0,l=0,h=n, p=1;
		while(mid<=h)
		{
			if(a.get(mid)<p)
			{
				Collections.swap(a, l, mid);
				l++;mid++;
			}
			else if (a.get(mid)==p)
			{
				mid++;
			}
			else if(a.get(mid)>p)
			{
				h--;
				Collections.swap(a,mid,h);
				
			}
			System.out.println(a);
		}
		System.out.println(a);

	}

}
