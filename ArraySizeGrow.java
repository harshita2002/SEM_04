import java.util.Scanner;
public class ArraySizeGrow {
	public static void display(int arr[],int s)
	{
		for (int i=0;i<s;++i)
		{
			System.out.println(arr[i]);
		}
	}
	public static void growSize(int arr[])
	{
		int s=arr.length*2;int temp[]=new int[s];
		for(int i=0;i<arr.length;++i)
		{
			temp[i]=arr[i];
		}
		arr=temp;
		System.out.println("The array size modified");
	}
	public static void input(int arr[],int s)
	{
		Scanner ss=new Scanner(System.in);
		for (int i=0;i<s;++i)
		{
			if(arr.length>=s-1)
			{
				arr[i]=ss.nextInt();
			}
			else
			{
				growSize(arr);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		int arr[]=new int[1];
		input(arr,size);
		display(arr,size);

	}

}
