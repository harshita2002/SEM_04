import java.util.*;
public class SampleOnlineData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		//Data set represents the number of packets initially there i.e n
		ArrayList<Integer> Dataset= new ArrayList<Integer>();
		int i;
		for(i=0;i<Dataset.size();++i)
		{
			Dataset.add(s.nextInt());
		}
		System.out.println("Enter the number if packets to be read k");
		int k=s.nextInt();
		//selecting the first k elements of the list
		ArrayList<Integer> Klist = new ArrayList<Integer>();
		for(i=0;i<k;++k)
		{
			Klist.add(Dataset.get(i));
		}
		int sz=k;
		Random ran=new Random();
		for(i=k;i<Dataset.size();++i)
		{
			int x=Dataset.get(i);
			sz=sz+1;
			int idx=ran.nextInt(sz);
			if(idx<k)
			{
				Klist.set(idx,k);
			}
		}
		System.out.println(Klist);

	}

}
