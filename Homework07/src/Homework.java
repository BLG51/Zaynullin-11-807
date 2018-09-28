import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, строку");
        int n = sc.nextInt(); String s = sc.next();
        System.out.println("Степень двойки: " + pow(n));
        System.out.println("Сумма цифр: " + numSum(n));
        System.out.println("Цифры справа налево: " + reversal(n));
        System.out.println("Слева направо: " + strictOrder(n));
        System.out.println("Простота: " + simpleCheck(n));
        System.out.println("Разложение на множители: " + multipliers(n));
        System.out.println("Палиндром: " + palindrom(s));

    }

    /**
     * D
     */
    static boolean pow(double n) {
        if (n == 1) return true;
            //else if (n < 1) return false;
        else if (n > 1 && n < 2) return false;
        else
            return pow(n / 2);

    }

    /**
     * E
     */
    static int numSum(int n) {
        if (n < 10) return n;
        else return n % 10 + numSum(n / 10);

    }

    /**
     * F
     */
    static String reversal(int n) {
        if (n < 10) return n+"";
        else {
            return n % 10 + " " + reversal(n / 10);
        }
    }

    /**
     * G
     */
    static String strictOrder(int n) {
        if (n < 10) return n+"";
        else {
            return strictOrder(n / 10) + " " +n % 10;
        }
    }

    /**
     * H
     */
    static boolean simpleCheck(int n) {
        return simple(n, n / 2);
    }

    static boolean simple(int n, int d) {
        if (d <= 1) return true;
        else if (n % d == 0) return false;
        else return simple(n, d - 1);
    }

    /**
     * I
     */
    static String multipliers(int n) {
        return 1 + " " + multi(n, 2);
    }

    static String multi(int n, int d) {
        if (d > n / 2) return n+"";
        else if (n % d == 0) {
            return d + " " + multi(n / d, d);
        } else
            return multi(n, d + 1);
    }

    /**
     * J
     */
    static boolean palindrom(String s) {
        if (s.length() == 1) return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() == 2) return true;
            else return palindrom(s.substring(1, s.length() - 1));
        } else
            return false;
    }
}
