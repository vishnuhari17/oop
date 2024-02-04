import java.util.*;
public class fact{
	public static void main(String args[]){
		int a, f=1, i;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the no : ");
		a=scanner.nextInt();
		for(i=1;i<=a;i++){
			f *= i;
		}
		System.out.println("The factorial of "+a+" is : "+f);
	}
}
