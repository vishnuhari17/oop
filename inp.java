import java.util.Scanner;

public class inp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the temp");
            Double d = sc.nextDouble();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
