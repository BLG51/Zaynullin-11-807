import java.util.Scanner;

/**
 * Created by user on 11.09.2018.
 */
public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int s = 0;
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
            s += arr[i];
        }
        double av = s / n;
        s = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > av) s++;
        }
        System.out.println(av +", " + s);
    }
}
