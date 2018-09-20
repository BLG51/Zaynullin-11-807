import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        System.out.println("Че каво u/l");
        String check = sc.next();
        switch (check) {
            case "u":
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 'a' && arr[i] <= 'z') {
                        arr[i] = (char) (arr[i] - 32);
                    }
                }
                break;
            case "l":
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 'A' && arr[i] <= 'Z') {
                        arr[i] = (char) (arr[i] + 32);
                    }
                }
                break;
        }
        s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        System.out.println(s);
    }
}
