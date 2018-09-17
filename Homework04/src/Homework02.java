import java.util.Scanner;

/**
 * Created by user on 14.09.2018.
 */
public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s += s.charAt(s.length());
            s = s.substring(s.length()-1);
        }
        System.out.println(s);
    }
}
