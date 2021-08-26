public class parity_of_word 
{
	public static int parity(int n)
	{
		int par=0;
		while(n!=0)
		{
			par^=n&1;
			n>>>=1;
		}
		return par;
	}
	public static void main(String[] args) 
	{
		System.out.println(parity(7));
		System.out.println(parity(10));
	}
}
