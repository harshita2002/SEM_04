import java.util.Scanner;	
public class Bitchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("enbter the  bit to be changed and to be changed to what");
		int pos=s.nextInt();
		int bit=s.nextInt();
		int m=1<<pos;
		System.out.println((n&~m)|((bit<<pos)& m));
	}

}
