import java.util.Scanner;

/**
 * Created by user on 14.09.2018.
 */
public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //int[] arr1 = new int[n];
        //int[] arr2 = new int[m];

        /*  just in case: standart method
            for (int i = 0; i < n-m+1; i++) {
            k=i
            for (int j = 0; j < m; j++) {
                if (arr[k] != arr2[j]) break;
            } else k++
            if (j == m) //nice we did it remember i
            break;
        }
        */

        String s1 = "", s2 = "";
        for (int i = 0; i < n; i++) {
            s1 += sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            s2 += sc.nextInt();
        }
        System.out.println(s1.indexOf(s2));
    }
}
