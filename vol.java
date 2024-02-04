import java.util.*;
class box
{
	double height;
	double width;
	double depth;
	box()
	{
		height = 10.0;
		width = 20.0;
		depth = 30.0;
	}
	box(double h, double w, double d)
	{
		height = h;
		width = w;
		depth = d;
	}
	box(double len)
	{
		height =width = depth = len;
	}
	double vol()
	{
		double vol;
		vol = height*width*depth;
		return vol; 
	}
}

class vol
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		box b1 = new box();
		box b2 = new box(2.5,3.5,4.5);
		box b3 = new box(10.5);
		System.out.println(b1.vol());
		System.out.println(b2.vol());
		System.out.println(b3.vol());
	}
}

