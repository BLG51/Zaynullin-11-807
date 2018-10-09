import java.util.Arrays;
import java.util.Scanner;

public class ClassTestTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] arr = getSideDiagonalAsVector(matrix);
        System.out.println(Arrays.toString(arr));
        int[] vec = mult(matrix, arr);
        System.out.println(Arrays.toString(vec));
        sortArr(vec);
        System.out.println(Arrays.toString(vec));
    }

    static int[] getSideDiagonalAsVector(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arr[i] = matrix[i][matrix.length - i - 1];
        }
        return arr;
    }

    static int[] mult(int[][] matrix, int[] arr) {
        int[] vec = new int[matrix.length];
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                vec[i] += (matrix[i][j] * arr[j]);
            }
        }
        return vec;
    }

    static void sortArr(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(arr[j]) < Math.abs(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
