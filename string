import java.util.Scanner;

public class string {
    public static String concatenate(String str1,String str2){
        String str3 = str1+str2;
        return str3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = concatenate("Hello"," world");
        System.out.println(result);
        result = result.replaceAll("world","Boii");
        System.out.println(result);
        System.out.println("Enter the word to be searched");
        String item = sc.nextLine();
        if(result.indexOf(item)!=-1){
            System.out.println("Word found");
        }
        else {
            System.out.println("Not found");
        }
        String substrings[] = result.split(" ");
        for(int i=0;i<substrings.length;i++)
        {
            System.out.println(substrings[i]);
        }
        char array[] = result.toCharArray();
        int left=0;
        int right = array.length-1;
        while(left<right){
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        String revstring = new String(array);
        System.out.println(revstring);
        String s1 = "hello";
        System.out.println(result.regionMatches(true,0,s1,0,5));
        System.out.println(s1.equals(result));
        result = result.toLowerCase();
        System.out.println(result);
        String arr[] = result.split(" ");
        int flag=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag!=0){
            System.out.println("There are duplicate world");
        }
        else {
            System.out.println("There are no duplicate words");
        }
    }



}
