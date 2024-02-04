class test
{
	int a;
	void set(test p)
	{
		p.a=20;
	}
}

class callref
{
	public static void main(String args[])
	{
		test t = new test();
		t.a=10;
		System.out.println("The value before fn call : "+t.a);
		t.set(t);
		System.out.println("The value after fn call : "+t.a);
	}
}
