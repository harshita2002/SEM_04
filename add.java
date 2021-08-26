public class add {
    public static long addition(long a, long b) 
    {
		long tempA = a, tempB = b, k = 1, sum = 0, carryin = 0;
		while (tempA != 0 || tempB != 0) {
			long ak = a & k;
			long bk = b & k;
			long carryout = (ak & bk) | (ak & carryin) | (bk & carryin);
			sum |= ak ^ bk ^ carryin;
			carryin = carryout << 1;
			k <<= 1;
			tempA >>= 1;
			tempB >>= 1;
		}
		sum |= carryin;
		return sum;
	}
    public static void main(String[] args) {
        System.err.println(addition(1,3));
    }
    
}
