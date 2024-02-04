class employee
{
	void display()
	{
		System.out.println("Name of the class is Employee");
	}
	void calc_sal()
	{
		System.out.println("Salary of Employee is 10000");
	}
}
class engineer extends employee
{
	void calc_sal()
	{
		super.calc_sal();
		System.out.println("Salary of Engineer is 20000");
	}
}
class office
{
	public static void main(String Args[])
	{
		engineer e1 = new engineer();
		e1.display();
		e1.calc_sal();
	
	}
}
