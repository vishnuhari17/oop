/*Bank is a class that provides functionality to get rate of interest. 
But, rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks could provide 5%, 6% and 7% rate of interest. 
Implement this scenario using the concept of method overriding */
class Bank
{
    public int interest()
    {
        return 0;
    }
}
class SBI extends Bank
{
    public int interest()
    {
        return 5;
    }
}
class ICICI extends Bank
{
    public int interest()
    {
        return 6;
    }
}
class AXIS extends Bank
{
    public int interest()
    {
        return 7;
    }
}
class override
{
    public static void main(String a[])
    {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        Bank bank=new Bank();
        bank=sbi;
        int c=bank.interest();
        System.out.println("The interest at SBI is "+c+"%");
        bank=icici;
        c=bank.interest();
        System.out.println("The interest at ICICI is "+c+"%");
        bank=axis;
        c=bank.interest();
        System.out.println("The interest at AXIS is "+c+"%");
    }
}