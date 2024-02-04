import java.util.*;
public class lar3{
	public static void main(String args[]){
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		if(a>b & a>c){
			System.out.println(a+" is the largest.");
		}else if(b>a & b>c){
			System.out.println(b+" is the largest.");
		}else{
			System.out.println(c+" is the largest.");
		}
	}
}
