import java.util.Scanner;
public class SwappingBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number and the bits to be swapped");
		int n=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		int temp=n;
		if(((temp>>>(a-1))&1)==((temp>>>(b-1))&1))
		{
			System.out.println("No need for swapping the bits have same value");
		}
		else
		{
			int i=1<<(a-1);
			int j=1<<(b-1);
			int mask=i|j;
			n=n^mask;
			System.out.println("Swapped number"+n);
		}

	}

}
