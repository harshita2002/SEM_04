import java.util.*;
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=1;
		for(int i=0;i<4;++i)
		{
			for(int j=i;j<4;++j)
			{
				System.out.print(" ");
			}
			int temp=p;
			while (temp!=0)
			{
				System.out.print((temp%10)+" ");
				temp=temp/10;
			}
			System.out.println();
			p=p*11;
		}
	}

}
