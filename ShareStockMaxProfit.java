import java.util.Scanner;
import java.util.ArrayList;
public class ShareStockMaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the weeks prices");
		int i;
		ArrayList <Integer>a=new ArrayList<Integer>(7);
		for(i=0;i<7;++i)
		{
			a.add(i,s.nextInt());
		}
		int minsofar=a.get(0),max_profit_sofar=0;
		int b=0,sell=0,temp1,temp2;
		for(i=1;i<7;++i)
		{
			temp1=minsofar;temp2=max_profit_sofar;
			minsofar=Math.min(minsofar, a.get(i));
			if(temp1!=minsofar)
			{
				b=i+1;
			}
			max_profit_sofar=Math.max(max_profit_sofar,a.get(i)-minsofar);
			if(temp2!=max_profit_sofar)
			{
				sell=i+1;
			}
		}
		System.out.println(max_profit_sofar);
		System.out.println("Buy on:"+(b)+"Sell on:"+sell);
	}

}
