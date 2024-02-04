import java.util.*;
class overload
{
	double calcArea(double a)
	{
		double area = 3.14*a*a;
		return area;
	}
	double calcArea(double a, double b)
	{
		double area = a * b;
		return area;
	}
	double calcArea(float a, float b)
	{
		double area=0.5*a*b;
		return area;
	}
}

class area
{
	public static void main(String args[])
	{
		overload o = new overload();
		int ch;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Which area would you like to find : ");
			System.out.println("1--Circle\n2--Rectangle\n3--Triangle\n4--Exit");
			ch=sc.nextInt();
			if(ch==1)
			{
				System.out.print("Enter the radius of the circle : ");
				double a=sc.nextDouble();
				double area=o.calcArea(a);
				System.out.println("The area of the circle with radius "+a+" is : "+area);
			}
			else if(ch==2)
			{
				System.out.print("Enter the length of the rectangle : ");
				double a=sc.nextDouble();
				System.out.print("Enter the breadth of the rectangle : ");
				double b=sc.nextDouble();
				double area=o.calcArea(a,b);
				System.out.println("The area of the rectangle is : "+area);
			}
			else if(ch==3)
			{
				System.out.print("Enter the breadth of the triangle : ");
				float a=sc.nextFloat();
				System.out.print("Enter the height of the triangle : ");
				float b=sc.nextFloat();
				double area=o.calcArea(a,b);
				System.out.println("The area of the triangle is : "+area);
			}
			else
			{
				System.out.println("Exiting.......");
				break;
			}
		}
	}
}

