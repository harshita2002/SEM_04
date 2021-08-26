import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class Dutch_flag_problem 
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
		
		dutchflagPartision(1,L1);
		System.out.println("After Reaaranging");
		System.out.println(L1);
	}
	public static void dutchflagPartision(int pivotIndex, ArrayList<Color> A) 
	{
		Color pivot=A.get(pivotIndex);
		for(int i=0;i<A.size();++i)
		{
			for(int j=i+1;j<A.size();++j)
			{
				if(A.get(j).ordinal()<pivot.ordinal())
				{
					Collections.swap(A,i,j);
					break;
				}
			}
		}
		System.out.println("After first pass");
		System.out.println(L1);
		for(int i=A.size()-1;i>=0 && A.get(i).ordinal()>=pivot.ordinal();--i)
		{
			for(int j=i-1;j>=0 && A.get(j).ordinal()>=pivot.ordinal();--j)
			{
				if(A.get(j).ordinal()>pivot.ordinal())
				{
					Collections.swap(A,i,j);
					break;
				}
			}
		}
	}
}
