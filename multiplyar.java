import java.util.*;
public class multiplyar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		String n=s.next();
		ArrayList <Integer>num1=new ArrayList<Integer>();
		int i,j,p;
		for(i=0;i<n.length();++i)
		{
			num1.add(Integer.parseInt(n.charAt(i)+""));
		}
		n=s.next();
		ArrayList <Integer>num2=new ArrayList<Integer>();
		for(i=0;i<n.length();++i)
		{
			num2.add(Integer.parseInt(n.charAt(i)+""));
		}
		//logic to multiply the numbers
		ArrayList <Integer>res=new ArrayList<Integer>(num1.size()+num2.size());
		for(i=0;i<num1.size()+num2.size();++i)
		{
			res.add(0);
		}
		for(i=num1.size()-1;i>=0;--i)
		{
			p=res.size()-(num1.size()-i);
			System.out.println(p);
			for(j=num2.size()-1;j>=0;--j)
			{
				int prod=num2.get(j)*num1.get(i);
				int sum=prod+res.get(p);
				int carry=sum/10;
				System.out.println(prod+" "+sum+" "+carry);
				res.set(p, sum%10);
				res.set(p-1, carry+res.get(p-1));
				--p;
			}
		}
		System.out.println("The product:"+res);
		
	}

}