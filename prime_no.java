import java.util.ArrayList;
import java.util.Collections;

public class prime_no 
{
	public static void main(String[] args) 
	{
		ArrayList <Integer> a = new ArrayList<Integer>();
        ArrayList <Boolean> b = new ArrayList<Boolean>();
        ArrayList <Integer> c = new ArrayList<Integer>();
        for(int i =0;i<=10;i++)
        {
            a.add(i);
        }
        System.out.println("The given list is "+a);
        for(int i =0;i<=10;i++)
        {
            b.add(true);
        }
        System.out.println(b);
        b.set(0, false);
        b.set(1, false);
        System.out.println(b);
        for(int i =2;i<=10;i++)
        {
            if (b.get(i))
            c.add(i);
            for(int j=i;j<=10;j+=i)
            {
                b.set(j, false);
            }
            System.out.println(b); 
        }
        System.out.println("The prime numbers from the list are "+c);
    }
}
