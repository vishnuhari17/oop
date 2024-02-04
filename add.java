import java.util.*;
class complex
{
	int real;
	int imaginary;
	void read(int a, int b)
	{
		real = a;
		imaginary = b;
	}
	complex add(complex z)
	{
		complex c3 = new complex();
		c3.real = real + z.real;
		c3.imaginary = imaginary + z.imaginary;
		return c3;
	}
}

class add
{
	public static void main(String Args[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		complex c1 = new complex();
		complex c2 = new complex();
		complex c3 = new complex();
		System.out.print("Enter the real part of the first no : ");
		a=sc.nextInt();
		System.out.print("Enter the imaginary part of the second no : ");
		b=sc.nextInt();
		c1.read(a,b);
		System.out.print("Enter the real part of the first no : ");
		a=sc.nextInt();
		System.out.print("Enter the imaginary part of the second no : ");
		b=sc.nextInt();
		c2.read(a,b);
		c3=c1.add(c2);
		System.out.println("The sum is : "+c3.real+" + "+c3.imaginary+"i");
	}
}
