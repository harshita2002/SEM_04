import java.util.Scanner;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int arr[]=new int[n];
		int i,j;
		for (i=0;i<n;++i)
		{
			//System.out.println("Enter an element");
			arr[i]=s.nextInt();
		}
		int piv=n-1;
		i=-1;j=0;
			for(j=0;j<n;++j)
			{
				if(arr[j]<=arr[piv])
				{
				++i;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				}
			}
		int temp=arr[i];
		arr[i]=arr[piv];
		arr[piv]=temp;
		for(i=0;i<n;++i)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
