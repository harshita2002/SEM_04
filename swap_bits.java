public class swap_bits 
{
	public static long doSwapBits(long num,int i, int j)
	{
		if(((num>>>i)&1)!=((num>>>j)&1))
		{
			long mask=(1L<<i)|(1L<<j);
			num=num^mask;
		}
		return num;
	}
	public static void main(String[] args) 
	{
		long x=10;
		long num=doSwapBits(10,1,6);
		System.out.println("Before swapping num = "+x+" \nAfter swapping num = "+num);
		
	}
}