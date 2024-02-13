class thread1 extends Thread
{
    public void run()
    {
        for(int i =0 ; i<100; i++)
        {
            System.out.println(i);
        }
    }
}

class thread2 extends Thread
{
    public void run()
    {
        for(int i =100 ; i>0; i--)
        {
            System.out.println(i);
        }
    }
}

class thread
{
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
