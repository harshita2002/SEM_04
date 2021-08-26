public class parity_generator 
{
	public static int parity (int num)
	{
		int parity=0;
		while(num!=0)
		{
			parity=parity^1;
			num=num&(num-1);
		}
		return parity;
	}
	public static int parityUsingLookUp(long num,int lookUp[],int groupSize)
	{
		int numOfGroup=Long.SIZE/groupSize;
		long bitMask=0XFFFF;
		int parity=0;
		while(numOfGroup>0)
		{
			//Creating group
			int index=(int)((num>>>((numOfGroup-1)*groupSize))&bitMask);
			parity=parity^lookUp[index];
			numOfGroup-=1;
		}
		return parity;
	}
	public static void LookUpTableCreation(int lookUp[])
	{
		for(int i=0;i<lookUp.length;i++) 
		{
			lookUp[i]=parity(i);
		}
	}
	public static void main(String[] args) 
	{
		int groupSize=16;
		int size=(int)Math.pow(2.0,groupSize);
		int LookUp[]=new int [size];
		LookUpTableCreation(LookUp);
		/*for(int i=0;i<10;i++)
		{
			System.out.println(LookUp[i]);
		}*/
		long num=10;
		int p=parityUsingLookUp(10,LookUp,groupSize);
		System.out.println("Parity of the number "+num+" is = "+p);
	}
}

