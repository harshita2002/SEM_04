
public class demo 
{
	public static void main(String args[])
	{
		int x=64;
		short r=0;
		while(x!=0)
		{
			r^=(x&1);
			x>>>=1;
			System.out.println(r);
		}
		//System.out.println(r);
	}
}
