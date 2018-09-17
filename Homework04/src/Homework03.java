import java.util.Scanner;

/**
 * Created by user on 14.09.2018.
 */
public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = Integer.max(a,b); i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        for (int i = a+b-Integer.max(a,b); i < arr.length-2; i++) {
            arr[i] = arr[i+1];
        }
        s = "";
        for (int i = 0; i < arr.length-2 ; i++) {
            s+=arr[i];
        }
        System.out.println(s);
    }
}
