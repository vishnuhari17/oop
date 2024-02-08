import java.io.*;


class c1 extends Thread
{
    public void run() {
        try {
            FileInputStream fin = new FileInputStream("finput.txt");
            FileOutputStream fout = new FileOutputStream("foutput.txt");
            int i = fin.read();
            while (i != -1) {
                if(i%2==0)
                {
                    fout.write(i);

                }

                i = fin.read();
            }
            fin.close();
            fout.close();

        } catch (FileNotFoundException fe) {

        }
        catch (IOException e)
        {

        }
    }
}

class c2 extends Thread
{
    public void run() {
        try {
            FileInputStream fin = new FileInputStream("finput.txt");
            FileOutputStream fout1 = new FileOutputStream("foutput1.txt");
            int n = fin.read();
            while (n != -1) {
                if(n%2!=0)
                {
                    fout1.write(n);

                }
                n = fin.read();
            }
            fin.close();
            fout1.close();

        } catch (FileNotFoundException fe) {

        }
        catch (IOException e)
        {

        }
    }
}


class oddevenfile
{
    public static void main(String a[])
    {
        c1 ch1=new c1();
        ch1.start();
        c2 ch2=new c2();
        ch2.start();
    }
}
