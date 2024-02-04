import java.util.*;
public class primerange{
	public static void main(String args[]){
		int ll, ul, flag, i, j;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the lower limit : ");
		ll=scanner.nextInt();
		System.out.print("Enter the upper limit : ");
		ul=scanner.nextInt();
		for(i=ll;i<ul;i++){
			flag=0;
			for(j=2;j<i;j++){
				if(i%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(i+" is a prime.");
			}
		}
	}
}
