import java.util.*;
public class search{
	public static void main(String args[]){
		int a[] = new int[20];
		int n,ele,i,flag=0,index=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of terms : ");
		n = sc.nextInt();
		System.out.println("Enter the elements");
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the element to be searched : ");
		ele = sc.nextInt();
		for(i=0;i<n;i++){
			if(ele==a[i]){
				index=i;
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println("Element found at index "+index);
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}
