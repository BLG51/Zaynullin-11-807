import java.util.Scanner;

public class CW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        int a = 1, b = 1;
        while (k < n) {
            a = k;
            k = a + b;
            b = a;
        }
        System.out.println(k == n);
    }

    int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = arr[i];
                }
            }
        }
        return arr;
    }
}
