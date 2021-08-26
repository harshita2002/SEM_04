import java.util.Scanner;
public class BitwisePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the base and the power");
		int x=s.nextInt();
		int y=s.nextInt();
		int res=1;
		while(y!=0)
		{
			if((y&1)==1)
			{
				res=res*x;
			}
			x=x*x;
			y>>>=1;
		}
		System.out.println(res);
				

	}

}
