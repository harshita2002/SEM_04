import java.awt.List;
import java.util.ArrayList;
public class maxProfitdemo 
{
	public static double calculateMaxProfit(ArrayList<Double> prices)
	{
		double minPrice=Double.MAX_VALUE, maxProfit=0.0;
		for(Double price:prices)
		{
			maxProfit=Math.max(maxProfit,price-minPrice);
			minPrice=Math.min(minPrice,price);
		}
		return maxProfit;
	}
	static ArrayList<Double> AList=new ArrayList<Double>();
	public static void main(String[] args) 
	{	
		AList.add(210.0);
		AList.add(115.0);
		AList.add(225.0);
		AList.add(275.0);
		AList.add(360.0);
		AList.add(270.0);
		AList.add(390.0);
		AList.add(240.0);
		AList.add(265.0);
		AList.add(320.0);
		double max=calculateMaxProfit(AList);
		System.out.println("The maximum profit is = "+max);
	}
}
