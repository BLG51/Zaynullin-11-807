import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            n = n*10 + arr[i]-48;
        }
        System.out.println(n);
    }
}
