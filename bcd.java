public class bcd {
    public static void main(String[] args) {
        int xorcheck=0;
        int n = 10;
        while(n>0)
    {
        int a= n&1;
        xorcheck= xorcheck^a;
        n>>>=1;
    }
    System.out.println(xorcheck);

    }
    
}
