import java.util.ArrayList;
import java.util.Scanner;

public class IncrementingBy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		for(int i=0;i<n;++i)
		{
			a.add(ss.nextInt());
		}
		int i=a.size()-1,s=0;
		do
		{
			if(i==-1)
			{
				a.add(0,0);i=0;
			}
			s=a.get(i)+1;
			a.set(i, s%10);
			s=s/10;
			--i;
			
		}while(s!=0);
		System.out.println(a);

	}

}
