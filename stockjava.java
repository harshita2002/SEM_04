import java.util.ArrayList;

public class stockjava 
{
    public static void main(String[] args) 
    {
        ArrayList <Integer> a = new ArrayList<Integer>();
        ArrayList <Integer> b = new ArrayList<Integer>();
        a.add(310);
        a.add(315);
        a.add(275);
        a.add(295);
        a.add(260);
        a.add(270);
        a.add(290);
        a.add(230);
        a.add(255);
        a.add(250);
        System.out.println(a);
        int min =Integer.MAX_VALUE;
        int max=0;
        for(int i:a)
        {
            max = Math.max(max, i-min);
            b.add(max);
            System.out.println(max);
            min=Math.min(min,i);
            System.out.println(min);
        }
        System.out.println(b);
        int x=b.indexOf(max);
        System.out.println(x);
        System.out.println("max selling price for profit is " +a.get(x));
        System.out.println("max buying price  for profit is " +(a.get(x)-max));


    }
}    