import java.util.Scanner;
class Rect
{
	double x,y,h,w;
	double a,b,c,d;
	void input()
	{
		System.out.println("Enter the x and y coordinates along with height and width");
		Scanner s=new Scanner(System.in);
		x=s.nextDouble();
		y=s.nextDouble();
		h=s.nextDouble();
		w=s.nextDouble();
		System.out.println("Input taken sucesfully");
	}
	boolean rectBoundaryCheck(Rect r1,Rect r2)
	{
		if((r1.x<=r2.x && r1.x+r1.h<=r2.x)||(r1.x>=r2.x && r1.x>=r2.x+r2.h))
		{
			return true;
		}
		else if((r1.y<=r2.y && r1.y+r1.w<=r2.y)||(r1.y>=r2.y && r1.y>=r2.y+r2.w))
		{
			return true;
		}
		return false;
	}
	
}
public class AssignmenRtectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Rect r1=new Rect();
		Rect r2=new Rect();
		r1.input();
		r2.input();
		if(r2.rectBoundaryCheck(r1, r2)/*||r2.rectBoundaryCheck(r2, r1)*/)
		{
			System.out.println("They donot intersect");
		}
		else
		{
			System.out.println("They  intersect");
		}		

	}

}
