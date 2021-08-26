import java.util.*;
public class SieveOFEastothenesReducuedComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList <Integer>arr= new ArrayList<Integer>();
		ArrayList <Boolean>isPrime= new ArrayList<Boolean>();
		System.out.println("Enter the max range");
		int n =s.nextInt();
		int i,j,p=0;
		for(i=0;i<=(n-2)/2;i=i+1)
		{
			isPrime.add(true);
		}
		System.out.println(isPrime);
		arr.add(2);
		for(i=0;i<isPrime.size();++i)
		{
			if(isPrime.get(i))
			{
				p=2*i+3;
				arr.add(p);
			}
			for(j=2*i*i +6*i+3;j<isPrime.size();j=j+p)
			{
				isPrime.set(j,false);
				
			}
			
		}
		System.out.println(isPrime);
		System.out.println(arr);
	}

}
