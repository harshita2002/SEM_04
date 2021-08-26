import java.util.Scanner;
public class ParityUsingLookUp {
	public static void constructLookUp(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;++i)
		{
			arr[i]=getParity(i);
		}
	}
	public static int getParity(int n)
	{
		int p=0;
		//n=n^n>>>16;
		n=n^n>>>8;
		n=n^n>>>4;
		n=n^n>>>2;
		n=n^n>>>1;
		return n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to get its parity");
		int n=sc.nextInt();
		int []arr=new int[256];
		int b=16;
		constructLookUp(arr);
		if(n<256)
		{
			System.out.println("The parity of the number:"+arr[n]);
		}
		else
		{
			while(b!=0)
			{
				n=n^n>>>b;
				b=b/2;
			}
			System.out.println("Parity of the number:"+n);
		}
	}

}
