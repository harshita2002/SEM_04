import java.util.ArrayList;
public class acendingarrzay {
    public static void main(String[] args) {
        ArrayList<Integer>a= new ArrayList<Integer>();
        a.add(3);
        a.add(3);
        a.add(1);
        a.add(0);
        a.add(2);
        a.add(0);
        a.add(1);
        System.out.println(a);
        int fin =0;
        int c = 0;
        int x = a.size()-1;
        for (int i=0;i<=fin;i++)
        {
            if(fin<x)
            {
            fin= Math.max(fin,i+a.get(i));
            System.out.println(fin);
            c++;
            }
        
        }
        System.out.println(c);
        if (fin==x)
        System.out.println("end");
        else
        System.out.println("cant get to end");
    }
    
}
