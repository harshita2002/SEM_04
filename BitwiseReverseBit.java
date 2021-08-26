import java.util.Scanner;
public class BitwiseReverseBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int rev=0;
		while(n!=0)
		{
			rev <<= 1;
			if((n&1)==1)
				rev=rev^1;
			n >>>= 1;
		}
	    System.out.println("reveresed bit="+rev);
	}

}
