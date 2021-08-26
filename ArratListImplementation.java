import java.util.*;
public class ArratListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList arr=new ArrayList(1);
		for(int i=0;i<5;++i)
		{
			System.out.println("Enter a number");
			arr.add(i,s.nextInt());
		}
		System.out.println("Sum of the elements.");
		int sum=0;
		for(int i=0;i<5;++i)
		{
			sum=sum+Integer.parseInt((arr.get(i).toString()));
		}
		System.out.println(sum);
	}

}
