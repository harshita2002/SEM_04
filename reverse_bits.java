public class reverse_bits 
{
	public static int swapBits(int num,int i,int j)
	{
		int numi=(num>>>i)&1;
		int numj=(num>>>j)&1;
		if(numi!=numj)
		{
			int bitMask=1<<i|1<<j;
			num=num^bitMask;
		}
		return num;
	}
	public static void main(String[] args) 
	{
		int n=8;
		for(int i=0,j=30;i<j;i+=1,j-=1)
		{
			n=swapBits(n,i,j);
		}
		System.out.println(n);
	}
}