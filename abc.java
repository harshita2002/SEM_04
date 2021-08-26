public class abc{
    public static void main(String[] args) {
 
        int x= 10;
        int count = 0;
    while(x>0)
    {
        count = count + (x & 1);
        x >>= 1;
    }
    System.out.println(count);
}
}