import java.util.*;
public class RotateArr90Deg {
	public static void show(ArrayList arr)
	{
		for(int i=0;i<arr.size();++i)
			System.out.println(arr.get(i));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows and colummns of an array");
		int r,c;
		r=s.nextInt();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		int j;
		for(int i=0;i<r;++i)
		{
			arr.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<r;++i)
		{
			System.out.println(i);
			for(j=0;j<r;++j)
			{
				arr.get(i).add(s.nextInt());
			}
		}
		show(arr);
		for(int i=0;i<r;++i)
		{
			arr.get(i).add(0);
		}
		for (int i=0;i<r;++i)
		{
			for(j=0;j<r-i;++j)
			{
				if(i==j && i!=0)
				{
					continue;
				}
				arr.get(j).set(r, arr.get(j).get(r-i-1));
				arr.get(j).set(r-i-1,arr.get(i).get(j));
			}
			int temp = arr.get(r-1).get(r-i-1);
			arr.get(r-1).set(r-i-1, arr.get(i).get(r));
			arr.get(i).set(r, temp);
			show(arr);
			System.out.println();
		}
		show(arr);
	}

}
