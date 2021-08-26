import java.util.Scanner;
public class Parity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int c=0;
		/*while(n!=0)
		{
			c=c^(n&1);
			n=n>>1;
		}*/
		while(n!=0 && (n&1)==1)
		{
			c=c+(n&1);
			n=n>>1;
		}
		System.out.println(c);
	}

}
