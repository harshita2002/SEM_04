import java.util.*;
public class bit_reversal 
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
	public static int lookUpTableCreation(int wordsize)
	{
		int size=(int)Math.pow(2,16);
		int lookUp[]=new int[size];
		for(int i=0;i<lookUp.length;i++)
		{
			//lookUp[i]=reverseBits(i);
		}
		return size ;
	}
	/*public static long reverseBit(int lookUp)
	{
		int bitMask=0XFFFF;
		//long rev=lookUp[(int)(x&bitMasl)]<<(3*wordSize);
		
		
	}*/
	public static void main(String[] args) 
	{
		int wordSize=16;
		//lookUpTable[]=lookUpTableCreation
	}

}
