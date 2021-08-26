import java.util.ArrayList;
import java.util.Scanner;


public class add1tonumber {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int x = sc.nextInt();
        ArrayList<Integer>a=new ArrayList<Integer>();
        for(int i=0;i<x;i++)
        {
            a.add(sc.nextInt());
        
        }
        int i=x-1,s=0;
        do
        {
            if(i==-1)
            {
                a.add(0,0);
                i=0;
            }
            s=a.get(i)+1;
            a.set(i,s%10);
            s/=10;
            --i;
        }while(s!=0);
        System.out.println(a);
    }
    
}
