public class Cw1 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 4};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) < min) min = Math.abs(arr[i] - arr[j]);
            }
        }
        System.out.println(min);
    }
}
