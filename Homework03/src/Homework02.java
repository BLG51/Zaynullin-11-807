import java.util.Scanner;

/**
 * Created by user on 12.09.2018.
 */
public class Homework02 {
    //Вывести индекс максимального по модулю элемента в массиве.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int k = 0;
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
            if (Math.abs(arr[i]) > max) {
                max = Math.abs(arr[i]);
                k = i;
            }
        }
        System.out.println(k);
    }
}
