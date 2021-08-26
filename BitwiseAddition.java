import java.util.Scanner;
public class BitwiseAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int c=0,aub,bub;
		System.out.println("Ennter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		while(b!=0)
		{
			c=a&b;
			a=a^b;
			b=c<<1;
		}
		System.out.println(a);
	}

}
