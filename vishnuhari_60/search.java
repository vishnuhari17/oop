import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        int a[] = new int[10];
        int elem,flag=0,i,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array: ");
        n = scanner.nextInt();
        System.out.println("Enter the elements : \n");
        for(i=0;i<n;i++)
        {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter the elements to be searched : ");
        elem = scanner.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==elem)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Element not found in the array\n");
        }
        else
        {
            System.out.println("Element found in the array\n");
        }

    }
}
