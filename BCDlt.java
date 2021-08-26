public class BCDlt {
    public static void main(String[] args) {
        int x= 8;
        int xorcheck=0;
    while(x>0)
    {
        xorcheck= xorcheck^1;
        x= (x & (x-1));
    }
    System.out.println(xorcheck);
    }
    
}
