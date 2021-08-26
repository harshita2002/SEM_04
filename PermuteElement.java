import java.util.*; 
public class PermuteElement {
static ArrayList <String>permutedArray = new ArrayList<String>();
static ArrayList <String>FinalArr= new ArrayList<String>();
public static void Permutations(ArrayList<String> permutedArray, int i)
{
	int j;
	for(j=i;j<permutedArray.size();++j)
	{
		Collections.swap(permutedArray,i,j);
		Permutations(permutedArray, i+1);
		Collections.swap(permutedArray, i, j);
	}
	if(i==permutedArray.size()-1)
	{
		FinalArr.add(permutedArray.toString());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		for(int i=0;i<str.length();++i)
		{
			permutedArray.add(str.charAt(i)+"");
		}
		Permutations(permutedArray,0);
		HashSet <String>ss=new HashSet<String>(FinalArr);
		System.out.println(ss);

	}
	
	
	

}
