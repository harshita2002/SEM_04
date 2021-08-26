import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TrueFalse {

	public static void main(String[] args) {
		ArrayList<Boolean> a=new ArrayList<Boolean>();
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		for(int i=0;i<n;++i)
		{
			a.add(ss.nextBoolean());
		}
		int mid=0,l=0,h=n-1;
		while(mid<=h)
		{
			if(a.get(mid)==false)
			{
				Collections.swap(a, l, mid);
				l++;mid++;
			}
			else if(a.get(mid)==true)
			{
				
				Collections.swap(a,mid,h);
				h--;
				
			}
			System.out.println(a);
		}
		

	}

}
