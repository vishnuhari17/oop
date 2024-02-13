class first extends Thread
{

    public synchronized void display(String name)
    {
        try
        {
            System.out.print("[ ");
            Thread.sleep(1000);
            System.out.print(name);
            Thread.sleep(1000);
            System.out.print(" ]");
            Thread.sleep(1000);
        }
        catch (Exception e) {}

    }
}

class second extends first
{
    String name;
    first fobj;
    second(first fobj,String name)
    {
        this.fobj = fobj;
        this.name = name;
    }
    public void run()
    {
        fobj.display(name);
    }
}


public class thread_sync {
    public static void main(String[] args) {
        first f = new first();
        second s1 = new second(f,"hello");
        second s2 = new second(f,"world");
        second s3 = new second(f,"synchronized");
        s1.start();
        s2.start();
        s3.start();
    }
}
