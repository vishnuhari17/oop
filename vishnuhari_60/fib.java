import java.util.*;
public class fib{
	public static void main(String args[]){
		int a,i,b,c,num;
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the limit : ");
		num=n.nextInt();
		if(num>=1){
			a=0;
			b=1;
			System.out.print(a+" ");
			if(num>=2){
				System.out.print(b+" ");
				for(i=2;i<num;i++){
					c=a+b;
					System.out.print(c+" ");
					a=b;
					b=c;
				}
			}
		}
		System.out.println();
	}
}
