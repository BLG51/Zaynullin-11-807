import java.util.Scanner;

/**
 * Created by user on 12.09.2018.
 */
public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 1; i < n-1 ; i++) {
            if (arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                k++;
            }
        }
        System.out.println(k);
    }
}
