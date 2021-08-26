import java.util.Scanner;
public class ParityBitLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=32,r;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		while(l>=2)
		{
			r=n>>(l/2);
			n=n^r;
			l=l/2;
		}
		System.out.println(n&1);
		

	}

}
