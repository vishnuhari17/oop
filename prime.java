import java.util.*;
public class prime{
	public static void main(String args[]){
		int n,i,flag=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the no : ");
		n=scanner.nextInt();
		for(i=2;i<n;i++){
			if(n%i==0){
				flag=1;
			}
		}
		if(flag==0){
			System.out.println(n+" is a prime.");
		}else{
			System.out.println(n+" is not a prime.");
		}
		
	}
}
