import java.util.*;
public class AlistMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int e;
		ArrayList arr=new ArrayList(n);
		for(int i=0;i<n;++i)
		{
			e=s.nextInt();
			arr.add(e);
		}
		int max=Integer.parseInt(arr.get(0).toString());
		int min=Integer.parseInt(arr.get(0).toString());
		int num;
		for(int i=1;i<n;++i)
		{
			num=Integer.parseInt(arr.get(i).toString());
			if(max<num)
			{
				max=num;
			}
			else if(min>num)
			{
				min=num;
			}
		}
		System.out.println("max="+max+"\n min="+min);

	}

}
