import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DutchProbAppr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		for(int i=0;i<n;++i)
		{
			a.add(ss.nextInt());
		}
		int mid=0,l=0,h=n-1;
		while(mid<=h)
		{
			if(a.get(mid)==2)
			{
				Collections.swap(a, mid, h);
				h--;
			}
			else if (a.get(mid)==1)
			{
				mid++;
			}
			else if(a.get(mid)==0)
			{
				Collections.swap(a,mid,l);
				l++;mid++;
			}
		}
		System.out.println(a);
	}

}
