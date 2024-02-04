import java.util.*;
public class pal{
	public static void main(String args[]){
		int a,n,rev=0,rem;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the no : ");
		a=scanner.nextInt();
		n=a;
		while(n>0){
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		if(rev==a){
			System.out.println(a+" is a palindrome.");
		}else{
			System.out.println(a+" is not a palindrome.");
		}
		
	}
}
