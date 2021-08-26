import java.util.ArrayList;
import java.util.Arrays;
public class duplicate_removal_array 
{
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {
        ArrayList<T> newList = new ArrayList<T>();
        for (T element : list) 
        {
        	if (!newList.contains(element)) 
        	{
                  newList.add(element);
            }
        }
        return newList;
    }
	public static void main(String[] args) 
	{
		ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		System.out.println("Original ArrayList: "+ list);
		ArrayList<Integer>newList = removeDuplicates(list);
		System.out.println("ArrayList after duplicates removed: "+ newList);
	}
}
