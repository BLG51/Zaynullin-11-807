import java.util.Scanner;

public class Fac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fac(sc.nextInt()));
    }

    static int fac(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p*=i;
        }
        return p;
    }
}
