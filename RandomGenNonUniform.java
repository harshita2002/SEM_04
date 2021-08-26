import java.util.*;
public class RandomGenNonUniform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of values");
		int n = s.nextInt();
		int i;
		ArrayList<Integer> values = new ArrayList<Integer>();
		for(i=0;i<n;++i)
		{
			values.add(s.nextInt());
		}
		System.out.println("Enter probs");
		ArrayList<Double> prob = new ArrayList<Double>();
		for(i=0;i<n;++i)
		{
			prob.add(s.nextDouble());
		}
		System.out.println("Enter the total size of the sample to be generated.");
		int tn=s.nextInt();
		double r;
		ArrayList<Integer> fs = new ArrayList<Integer>();
		for(i=0;i<tn;++i)
		{
			r=Math.random();
			double sum = 0.0;
			int c = 0;
			while (r>sum)
			{
				sum = sum+prob.get(c);
				c++;
			}
			c=c-1;
			fs.add(values.get(c));
		}
		System.out.println(fs);
	}

}
