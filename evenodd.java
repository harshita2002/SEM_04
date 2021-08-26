public class evenodd {
    public static void main(String[] args) {
        int arr[]={12, 17, 70, 15, 22, 65, 21, 90};
        int left=0;
        int temp;
        int right=arr.length-1;
        while (left<right)
        {
            if(arr[left]%2==0)
            {
                left++;
            }
            else
            {
                temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right--;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");}
    }
    
}
