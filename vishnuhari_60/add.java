import java.util.*;
public class add{
	public static void main(String args[]){
		int a[][] = new int[20][20];
		int b[][] = new int[20][20];
		int res[][] = new int[20][20];
		int r1,c1,r2,c2,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows of 1st matrix: ");
		r1 = sc.nextInt();
		System.out.print("Enter the no of cols of 1st matrix: ");
		c1 = sc.nextInt();
		System.out.print("Enter the no of rows of 2nd matrix: ");
		r2 = sc.nextInt();
		System.out.print("Enter the no of cols of 2nd matrix: ");
		c2 = sc.nextInt();
		if(r1==r2&&c1==c2){
			System.out.println("Enter the elements of 1st matrix: ");
			for(i=0;i<r1;i++){
				for(j=0;j<c1;j++){
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the elements of 2nd matrix: ");
			for(i=0;i<r2;i++){
				for(j=0;j<c2;j++){
					b[i][j] = sc.nextInt();
				}
			}
			for(i=0;i<r1;i++){
				for(j=0;j<c1;j++){
					res[i][j] = a[i][j]+b[i][j];
				}
			}
			System.out.println("The Sum of the two matrix's is : ");
			for(i=0;i<r1;i++){
				for(j=0;j<c1;j++){
					System.out.print(res[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("These two matrixes cannot be added!");
		}
		
		
	}
}
