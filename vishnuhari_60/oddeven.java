import java.util.*;
public class oddeven{
	public static void main(String b[]){
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the no : ");
		n=scanner.nextInt();
		if(n%2==0){
			System.out.println(n+" is even");
		}
		else{
			System.out.println(n+" is odd");
		}
	}
}
