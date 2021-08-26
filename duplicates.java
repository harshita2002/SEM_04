import java.util.ArrayList;

public class duplicates {
    public static void main(String[] args) 
    {
        ArrayList <Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(3);
        System.out.println(a);
        if (a.isEmpty()) {
         System.out.println("no element present");
         }
        int c = 1;
        for (int i = 1; i < a.size(); ++i)
        {
            if ((a.get(c - 1).equals(a.get (i))==false)) 
            {
            a.set((c++), a.get(i));
            } 
        }
        System.out.print(c);
        for(int i =0; i< c; i++)
        {
            System.out.println(a.get(i));
        } 
        System.out.println(a);   
    }
    
}

