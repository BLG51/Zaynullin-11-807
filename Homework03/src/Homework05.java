import java.util.Scanner;

/**
 * Created by user on 12.09.2018.
 */
public class Homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        String s = "";
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            s += arr[i];
        }
        int x = Integer.parseInt(s);
        //можно сразу писать в int: считать количество цифр (k), умножать число на 10^k и прибавлять новое число
        System.out.println(x);
    }
}
