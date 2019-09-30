public class Vstavka {
    public static void main(String[] args) {
        int[] arr = {5, 0, 3, 4, 1, 7, 5, 4};
        for (int i = arr.length; i > 0; i--) { // 0 to length
            int indMax = 0;
            //int k = -1;
            for (int j = 0; j < i; j++){ //i to n-i
                if (arr[j] > arr[indMax]) { indMax = j;}
            }
            int m = arr[i-1];  //n-1-i
            arr[i-1] = arr[indMax];
            arr[indMax] = m;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
