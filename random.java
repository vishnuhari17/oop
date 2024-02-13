//import java.util.Random;
//import java.util.Scanner;
//
//class first extends Thread
//{
//    public void run()
//    {
//        Scanner sc=new Scanner(System.in);
//
//        try
//        {
//            Random r=new Random();
//            for(int i=1;i<10;i++)
//            {
//                int a=r.nextInt();
//                if(a%2==0)
//                {
//                    even e=new even(a);
//                    e.start();
//                }
//                else
//                {
//                    odd o=new odd(a);
//                    o.start();
//
//                }
//            }
//
//            class even extends Thread
//            {
//                int n1;
//                even(int n)
//                {
//                    n1=n;
//                }
//                public void run()
//                {
//                    try
//                    {
//                        System.out.println(n1*n1);
//                    }
//                    catch(Exception e)
//                    {
//
//                    }
//                }
//            }
//
//            class odd extends Thread
//            {
//                int k1;
//                odd(int k)
//                {
//                    k1=k;
//                }
//                public void run()
//                {
//                    try
//                    {
//                        System.out.println(k1*k1*k1);
//                    }
//                    catch(Exception e)
//                    {
//
//                    }
//                }
//            }
//
//
//        }
//        catch(Exception e)
//        {
//
//        }
//    }
//}
//
//class random
//{
//    public static void main()
//    {
//        first f=new first();
//        f.start();
//    }
//}