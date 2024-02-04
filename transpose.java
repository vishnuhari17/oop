import java.util.*;
public class transpose{
	public static void main(String args[]){
		int a[][] = new int[20][20];
		int b[][] = new int[20][20];
		int r1,c1,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows of 1st matrix: ");
		r1 = sc.nextInt();
		System.out.print("Enter the no of cols of 1st matrix: ");
		c1 = sc.nextInt();
		System.out.println("Enter the elements of 1st matrix: ");
		for(i=0;i<r1;i++){
			for(j=0;j<c1;j++){
				a[i][j] = sc.nextInt();
			}
		}
		for(i=0;i<r1;i++){
			for(j=0;j<c1;j++){
				b[j][i] = a[i][j];
			}
		}
		System.out.println("The Transpose of the matrix is : ");
		for(i=0;i<c1;i++){
			for(j=0;j<r1;j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
		
		
		
		
		
		
