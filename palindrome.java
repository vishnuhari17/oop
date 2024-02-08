import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.printf("Enter the string :");
        String str = sc.nextLine();
        for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("The string is a palindrome");
            StringBuffer str1 = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                char current_char = str.charAt(i);
                if (str1.indexOf(String.valueOf(current_char)) == -1) {
                    str1.append(str.charAt(i));
                    int count = 0;
                    for (int j = i; j < str.length(); j++) {
                        if (str.charAt(j) == current_char) {
                            count++;
                        }
                    }
                    System.out.println("The character " + str.charAt(i) + " occured " + count + " times.");
                }
            }
            System.out.println("The string of unique characters is : " + str1);
        }
    }
}
