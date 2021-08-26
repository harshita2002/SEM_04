import java.util.Scanner;
public class Bitwisedivision {
	public static long divide(long x, long y) {
		long result = 0;
		int power = 32;
		long yPower = y << power ;
		while (x >= y)
		{
			while (yPower > x)
			{
					yPower= yPower >>> 1;
					--power ;
			}
			result += 1L <<power;
			x -= yPower;
		}
		return result;
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int x,y,r,q=0,n=2;
		//x=s.nextInt();
		//y=s.nextInt();
		System.out.println(divide(10,2));
}
}