import java.util.Scanner;
public class BitwisweMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers to be miltiplied");
		int x,y;
		x=s.nextInt();
		y=s.nextInt();
		int sum=0,c=0;
		while(y!=0)
		{
			if((y&1)==1)
			{
				sum=sum+(x<<c);
			}
			c++;
			y=y>>>1;
		}
		System.out.println("The product="+sum);

	}

}
