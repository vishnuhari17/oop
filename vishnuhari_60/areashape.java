import java.util.Scanner;
interface Shape
{
    void getArea();
}
class Rectangle implements Shape
{
    int l,b,area;
    public void getArea()
    {
        System.out.println("Enter the length and breadth of the rectangle: ");
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        area=l*b;
        System.out.println("The area of the rectangle is "+area);
    }
}
class Triangle implements Shape
{
    double h,b,area;
    public void getArea()
    {
        System.out.println("Enter the base and height of the triangle: ");
        Scanner sc=new Scanner(System.in);
        b=sc.nextDouble();
        sc.nextLine();
        h=sc.nextDouble();
        area=h*b*0.5;
        System.out.println("The area of the triangle is "+area);
    }
}
class Circle implements Shape
{
    double r,area;
    public void getArea()
    {
        System.out.println("Enter the radius of the circle: ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=3.14*r*r;
        System.out.println("The area of the circle is "+area);
    }
}
class areashape
{
    public static void main(String a[]) 
    {
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        Triangle t=new Triangle();
        r.getArea();
        c.getArea();
        t.getArea();
    }
}
