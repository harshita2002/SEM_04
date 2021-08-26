import java.util.*;
public class AlistTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println(" Enter the array size and elements");
		ArrayList<Integer> a=new ArrayList();
		int size=s.nextInt();
		for(int i=0;i<size;++i)
		{
			a.add(s.nextInt());
		}
		int maxd=0;
		for(int i=0;i<size;++i)
		{
			maxd = Math.max(maxd, i+a.get(i));
		}
		System.out.println(maxd);
		System.out.println(maxd>=size);
	}

}
