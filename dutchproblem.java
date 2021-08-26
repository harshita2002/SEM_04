import java.util.ArrayList;
import java.util.Collections;
public class dutchproblem 
{
	public static enum Color{RED,WHITE,BLUE};
	static ArrayList<Color> L1=new ArrayList<Color>();
	public static void main(String[] args) 
	{
		L1.add(0,Color.RED);
		L1.add(1,Color.WHITE);
		L1.add(2,Color.BLUE);
		
		L1.add(3,Color.RED);
		L1.add(4,Color.WHITE);
		L1.add(5,Color.BLUE);
		
		L1.add(6,Color.RED);
		L1.add(7,Color.WHITE);
		L1.add(8,Color.BLUE);
		
		System.out.println("Before reaaranging");
		System.out.println(L1);
		System.out.println();
		dutchflag(1,L1);
		System.out.println("After Reaaranging");
		System.out.println(L1);
	}
	public static void dutchflag(int pivotIndex, ArrayList<Color> A)
	{
		Color pivot=A.get(pivotIndex);
		int small=0,equal=0,large=A.size();
		while(equal<large)
		{
			if(A.get(equal).ordinal()<pivot.ordinal())
			{
				Collections.swap(A, small++, equal++);
			}
			else if (A.get(equal).ordinal()==pivot.ordinal())
			{
				++equal;
			}
			else
			{
				Collections.swap(A,equal,--large);
			}
		}
	}
}
