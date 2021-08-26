import java.util.Scanner;
public class LookUpTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("Enter a the size for the look up table");
		int n=s.nextInt();
		int arr[]=new int[n];
		int c=0,tn;
		
		for(int i=0;i<n;++i)
		{
			tn=i;c=0;
			while(tn!=0)
			{
				tn=tn&(tn-1);
				c^=1;
			}
			arr[i]=c;
		}
		System.out.println("The array is made");

	}

}
