import java.util.ArrayList;
import java.util.Scanner;
public class Sieve_Of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Max Range");
		int n=s.nextInt();
		ArrayList <Boolean>isPrime=new ArrayList<Boolean>();
		isPrime.add(false);
		isPrime.add(false);
		int i,j,p;
		for(i=2;i<=n;++i)
		{
			isPrime.add(true);
		}
		System.out.println(isPrime);
		for(p=2;p<=n;++p)
		{
			for(j=p+p;j<=n;j+=p)
			{
				isPrime.set(j, false);
			}
		}
		//loop to add the numbers
		ArrayList <Integer>arr=new ArrayList<Integer>();
		for(i=0;i<=n;++i)
		{
			if(isPrime.get(i))
			{
				arr.add(i);
			}
		}
		System.out.println(isPrime);
		System.out.println(arr);
		
	}

}
