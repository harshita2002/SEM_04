public class weight {
    public static long closestSameWeightNum(long x) {
		//where n is the integer weight.
		for (int i = 0; i < Long.SIZE - 2; ++i) {
			if ((((x >> i) & 1) != ((x >> (i + 1)) & 1))) {
				x ^= (1 << i) | (1 << (i + 1)); 
				break;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println(closestSameWeightNum(20));
	}
    
}
