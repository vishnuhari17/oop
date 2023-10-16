class test
{
	void set(int i,int j)
	{
		i = 20;
		j = 30;
	}
}

class callval
{
	public static void main(String args[])
	{
		test t = new test();
		int a =5, b=10;
		System.out.println("The value before fn call : "+a+" & "+b);
		t.set(a,b);
		System.out.println("The value after fn call : "+a+" & "+b);
	}
}
