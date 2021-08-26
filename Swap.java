import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int x=s.nextInt();
		int y=s.nextInt();
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x+" "+y);
	}

}
