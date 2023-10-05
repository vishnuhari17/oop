import java.util.*;
public class multi{
	public static void main(String args[]){
		int a[][] = new int[20][20];
		int b[][] = new int[20][20];
		int res[][] = new int[20][20];
		int r1,c1,r2,c2,i,j,k,sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows of 1st matrix: ");
		r1 = sc.nextInt();
		System.out.print("Enter the no of cols of 1st matrix: ");
		c1 = sc.nextInt();
		System.out.print("Enter the no of rows of 2nd matrix: ");
		r2 = sc.nextInt();
		System.out.print("Enter the no of cols of 2nd matrix: ");
		c2 = sc.nextInt();
		if(r2==c1){
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
				for(j=0;j<c2;j++){
					sum=0;
					for(k=0;k<r2;k++){
						sum += a[i][k]*b[k][j];
					}
				res[i][j]=sum;
				}
			}
			System.out.println("The Resultant matrix is : ");
			for(i=0;i<r1;i++){
				for(j=0;j<c2;j++){
					System.out.print(res[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("These two matrixes cannot be multiplied");
		}
		
		
	}
}
