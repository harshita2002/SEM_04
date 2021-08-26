import java.util.Scanner;
public class BitwiseNumberWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=s.nextInt();
		int temp=n,pos=0,m,m1;
		while(true)
		{
			if(((n>>pos)&1)!=((n>>(pos+1))&1))//true if the bits are not same
			{
				//now we will make the one 0 and 0 one
				
					m=1<<pos;
					m1=1<<(pos+1);
					m=m|m1;
					n=n^m;
					break;
			}
			pos++;
		}
		System.out.println(n);
	}

}
