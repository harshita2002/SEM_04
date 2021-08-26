import java.util.Scanner;
public class BinaryReversalLookUp {
	public static int reverseBit(int n)
	{
		int c=0,revnum=0;
		while(n!=0)
		{
			if((n&1)==1)
			{revnum=(revnum<<c)|1;c=0;}
			c++;
			n=n>>>1;
		}
		return revnum;
	}
	public static void constructLookUp(int arr[])
	{
		for(int i=0;i<arr.length;++i)
		{
			arr[i]=reverseBit(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int arr[]=new int[256];
		constructLookUp(arr);
		int n=s.nextInt();
		System.out.println(arr[n]);
		
	}

}
