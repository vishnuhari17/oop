import java.util.*;
public class armstrong{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n, sum=0, n1, cube, rem;
		System.out.print("Enter the no : ");
		n=scanner.nextInt();
		n1=n;
		while(n1>0){
			rem=n1%10;
			n1=n1/10;
			cube=rem*rem*rem;
			sum+=cube;
		}
		if(sum==n){
			System.out.println(n+" is an armstrong no.");
		}else{
			System.out.println(n+" is not an armstrong no.");
		}
		
		
	}
}
