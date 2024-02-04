abstract class Shape
{
    abstract void numberofSides();
}
class Rectangle extends Shape
{
    void numberofSides()
    {
        System.out.println("The number of sides in a rectangle is 4");
    }
}
class Triangle extends Shape
{
    void numberofSides()
    {
        System.out.println("The number of sides in a triangle is 3");
    }
}
class Hexagon extends Shape
{
    void numberofSides()
    {
        System.out.println("The number of sides in a hexagon is 6");
    }
}
class sideno
{
    public static void main(String a[])
    {
        Rectangle r=new Rectangle();
        r.numberofSides();
        Triangle t=new Triangle();
        t.numberofSides();
        Hexagon h=new Hexagon();
        h.numberofSides();
    }
}