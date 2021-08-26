public class dutchflag1 {
	public static void dfs(int a[], int pivots)
	{
		int lo = 0;
		int hi = a.length -1 ;
		int mid = 0, temp = 0;
		while (mid <= hi)
		{
			if (a[mid]<pivots)
			{
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
			}
			else if (a[mid]==pivots)
			{
				mid++;
			}
			else if (a[mid]>pivots) 
			{
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
			}
		}
	}
	public static void printArray(int arr[], int arr_size)
	{
		int i;
		for (i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
	public static void main(String[] args)
	{
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int arr_size = arr.length;
		int pivot_value=1;
		dfs(arr, pivot_value);
		System.out.println("Array after");
		printArray(arr, arr_size);
	}
}
