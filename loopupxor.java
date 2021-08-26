public class loopupxor {
    public static int Parity(long x)
    {
        
        x ^= x >>> 32;
        x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;
 
        return (int) (x & 1);
    }
 
    public static void main(String[] args)
    {
        long x = 8;
 
        System.out.println(Parity(x));
    }
    
}
