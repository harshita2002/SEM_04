
public class array_bit_reversal 
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
	public static int reverseBit(int num)
	{
		for(int i=0,j=30;i<j;i+=1,j-=1)
		{
			num=swapBits(num,i,j);
		}
		return num;
	}
	public static void main(String[] args) 
	{
		int size=(int)Math.pow(2,16);
		int lookUp[]=new int[size];
		for(int i=0;i<lookUp.length;i++)
		{
			lookUp[i]=reverseBit(i);
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(lookUp[i]);
		}
	}
}
