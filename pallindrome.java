import java.util.*;


class pallindrome
{
    public static void main(String a[])
    {

        int l;
        String str,reverse="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
        l=str.length();
        for(int i=l-1;i>=0;i--)
        {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);


    }
}