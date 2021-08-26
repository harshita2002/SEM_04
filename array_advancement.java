import java.util.ArrayList;
public class array_advancement 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>a= new ArrayList<Integer>();
        a.add(3);
        a.add(3);
        a.add(1);
        a.add(0);
        a.add(2);
        a.add(0);
        a.add(1);
        System.out.println("The array elements are "+a);
        int f=0;
        int x=a.size()-1;
        for(int i=0;i<=f;i++)
        {
            if(f<x)
            {
            f= Math.max(f,i+a.get(i));
            System.out.println(f);
            }
        }
        if (f==x)
        System.out.println("Last Index is reached");
        else
        System.out.println("Can't reach to the end");
	}
}
