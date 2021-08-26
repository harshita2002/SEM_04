
public class bitwise_demo 
{
	public static void main(String[] args) 
	{
		int numBit=countBit(15);
		System.out.println(numBit);
	}
	public static int countBit(int num)
	{
		int numBit=0;
		while(num!=0)
		{
			//count number of bits using masking
			numBit=numBit+(num&1);
			num=num>>>1;
		}
		return numBit;
	}
}
