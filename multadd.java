public class multadd {

	public static long multiply(long a, long b) {
		long product = 0;
		while (a != 0) {
			if ((a & 1) != 0)
				product = add(product, b);
			a >>= 1;
			b <<= 1;
		}
		return product;
	}

	public static long add(long a, long b) {
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
		System.out.println(" 11 * 7 = " + multiply(11, 7));
		System.out.println(" 11 * 7 = " + multiply(11, 7));
	}

}