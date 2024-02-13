import java.io.*;

class count
{

    public static void main(String args[])
    {
        int wordcount=0,linecount=0,charcount=0,i;

        try
        {
            FileInputStream fin=new FileInputStream("inp.txt");
            do {
                i = fin.read();
                char ch = (char) i;
                if (i != -1) {

                    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                        charcount++;
                    }
                    if (ch == '\n') {
                        linecount++;
                    }
                    if (ch == '\n' || ch == ' ') {
                        wordcount++;
                    }
                }
            }while(i!=-1);

            fin.close();
        }

        catch(Exception e)
        {

        }

        System.out.println("The no: of lines is"+ ++linecount);
        System.out.println("The no: of words is"+wordcount);
        System.out.println("The no: of characters  is"+charcount);
    }
}