import java.util.Scanner;
public class OppSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter 2 binary number");
		int n1=s.nextInt();
		int n2=s.nextInt();
		if(((n1^n2)>>>31)==1)
		{
			System.out.println("Opposite sign");
		}
		else
			System.out.println("Same sign");
	}

}
