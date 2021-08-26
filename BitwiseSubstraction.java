import java.util.Scanner;
public class BitwiseSubstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int bor=0,aub,bub;
		System.out.println("Ennter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		while(b!=0)
		{
			bor=~a&b;
			a=(a)^b;
			b=bor<<1;
		}
		System.out.println(a);
	}

}
