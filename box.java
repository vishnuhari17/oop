import java.util.*;
class Box{
	double width;
	double height;
	double depth;
	double volume(){
		double vol;
		vol=width*height*depth;
		return vol;
	}
}
public class box{
	public static void main(String args[]){
		double vol,vol2;
		Box b1 = new Box();
		Box b2 = new Box();
		b1.width=10;
		b1.height=20;
		b1.depth=2;
		vol=b1.volume();
		b2.width=10;
		b2.height=30;
		b2.depth=2;
		vol2=b2.volume();
		System.out.println(vol);
		System.out.println(vol2);
	}
}
