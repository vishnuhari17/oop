import java.io.*;


class child1 extends Thread
{
    public void run() {
        try {
            FileInputStream fin = new FileInputStream("f1.txt");
            FileOutputStream fout = new FileOutputStream("f2.txt");
            int i = fin.read();
            while (i != -1) {
                char c = (char) i;
                if (c >= 'a' && c <= 'z') {
                    fout.write(c);
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

class child2 extends Thread
{
    public void run() {
        try {
            FileInputStream fin = new FileInputStream("f1.txt");
            FileOutputStream fout1 = new FileOutputStream("f3.txt");
            int n = fin.read();
            while (n != -1) {
                char ch = (char) n;
                if (ch >= 'A' && ch <= 'Z') {
                    fout1.write(ch);
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


class threadfile
{
    public static void main(String a[])
    {
        child1 ch1=new child1();
        ch1.start();
        child2 ch2=new child2();
        ch2.start();
    }
}