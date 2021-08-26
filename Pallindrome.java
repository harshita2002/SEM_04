import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int temp=n,sum=0;
		while(n!=0)
		{
			sum=sum*10+n%10;
			n=n/10;
		}
		if (sum==temp)
			System.out.println("Yes the numbers are pallindrome");
		else
			System.out.println("No they are not a plallindrome");

	}

}
