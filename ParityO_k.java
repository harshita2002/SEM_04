import java.util.Scanner;
public class ParityO_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int p=0;
		while(n!=0)
		{
			n=n&(n-1);
			p^=1;
		}
		System.out.println(p);

	}

}
