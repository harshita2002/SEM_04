public class reversetable {

	// Reverse of a part
	public static long reversePart(long num) {
		long rev = 0;
		int n = Long.SIZE / 4 - 1;
		while (n > 0) {
			rev |= (num & 1);
			num >>= 1;
			rev <<= 1;
			n--;
		}
		return rev;
	}
	
	
	// Lookup table creation 
	public static long[] createLookUpTable() {
		long arr[] = new long[(int) Math.pow(2, 16)];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reversePart(i);
		}
		return arr;
	}

	// Reverse implementing parallel computing
	public static long reverse(long num, long lookUpArr[]) {
		long mask = 0xFFFF;
		int wordSize = 16;
		return lookUpArr[(int) (num & mask)] << (3 * wordSize)
				| lookUpArr[(int) ((num >> wordSize) & mask)] << (2 * wordSize)
				| lookUpArr[(int) ((num >> (2 * wordSize)) & mask)] << wordSize
				| lookUpArr[(int) ((num >> (3 * wordSize)) & mask)];
	}

	public static void main(String[] args) {
		long[] lookUpTable = createLookUpTable();
		System.out.println(reverse(1, lookUpTable));
	}

}