import java.util.Scanner;
import java.util.ArrayList;
public class DeleteDuplicateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();int i;
		ArrayList <Integer>arr=new ArrayList<Integer>(n);
		for(i=0;i<n;++i)
		{
			arr.add(i,s.nextInt());
		}
		i=0;
		while (i<n-1)
		{
		if(arr.get(i)==arr.get(i+1))
		{
			arr.remove(i);n--;
		}
		else
		{
			++i;
		}
		}
		System.out.println(arr);

	}

}
