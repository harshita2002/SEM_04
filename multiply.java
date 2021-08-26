public class multiply {
    public static long multiple(long x, long y)
    {
        long r = 0;
        while(x>0|y>0)
        {
            if((x&1)==1)
            {
                r=r+(y);
            }
            x>>>=1;
            y<<=1;
        }
        return r;

    }
    public static void main(String[] args) {
        long a =multiple(13, 9);
        System.out.println(a);
    }
    
}
