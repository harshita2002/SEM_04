import java.util.*;
public class DutchProb {


		public static void main(String[] args) {
				// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();

		a.add(1);
		a.add(0);
		a.add(0);
		a.add(2);
		a.add(1);
		a.add(2);
		a.add(1);
		a.add(0);
		a.add(0);
		a.add(2);
		a.add(1);
		a.add(2);
		a.add(1);
		a.add(0);
		a.add(0);
		a.add(2);
		a.add(2);
		a.add(1);

		int i=0,p=1;
		for(int j=0;j<a.size();j++)
		{
			if(a.get(j)<=p)
				{
				Collections.swap(a,j, i);
				i++;
				}
			
		}
		i=a.size()-1;
		for(int j=a.size()-1;j>=0;j--)
		{
			if(a.get(j)>=p)
				{
				Collections.swap(a,j, i);
				i--;
				}
			
		}

		System.out.println(a);

			}

		}



