import java.util.*;
public class AlistSortName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		ArrayList<String> arr=new ArrayList<String>(n);
		int i;
		for(i=0;i<n;++i)
		{
			arr.add(s.next());
		}
		Collections.sort(arr);
		for(i=0;i<n;++i)
		{
			System.out.println(arr.get(i));
		}
	}

}
