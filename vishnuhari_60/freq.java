import java.util.*;
class freq
{
	public static void main(String args[])
	{
		String str;
		char k;
		int count=0,i;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		k = sc.nextLine().charAt(0);
		for(i=0;i<str.length();i++)
		{
			if(k==str.charAt(i))
			{
				count ++;
			}
		}
		System.out.println(count);
	}
}
