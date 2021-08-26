import java.util.*;
public class ArrayListColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList <String>arr=new ArrayList<String>(5);
		System.out.println("Add 5 colors");int i;
		for(i=0;i<5;++i)
		{
			arr.add(i,s.next());
		}
		for(i=0;i<5;++i)
		{
			System.out.println(arr.get(i));
		}
		System.out.println("Enter a color to be replaced");
		arr.set(1, s.next());
		arr.remove(2);
		for(i=0;i<4;++i)
		{
			System.out.println(arr.get(i));
		}
		
	}

}
