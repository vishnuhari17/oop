import java.util.*;
import java.util.Arrays;
public class sort{
	public static void main(String args[]){
		int a[] = new int[20];
		int n,ele,i,flag=0,index=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of terms : ");
		n = sc.nextInt();
		System.out.println("Enter the elements : ");
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a,0,n);
		System.out.print("The sorted array is : ");
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
