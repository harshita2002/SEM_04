import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class DutchProblem_O_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		for(int i=0;i<n;++i)
		{
			a.add(ss.nextInt());
		}
		

		int i=0,p=1,s=0,l=a.size()-1;
		for( i=0;i<a.size();i++)
		{
			if(a.get(i)<=p)
				{
				Collections.swap(a,s++, i);
				}
			
		}
		for(int j=a.size()-1;j>=0;j--)
		{
			if(a.get(j)>=p)
				{
				Collections.swap(a,l--, j);
				}
			
		}
		System.out.println(a);


	}

}
