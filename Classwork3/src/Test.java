public class Test {
    public static void main(String[] args) {
        int a = 30, b = 16;

    }

    static void rec(int a, int b) {
        if (a<b) {
            System.out.println(a);
        }
        rec(a+1,b);

        if (a>b)
            System.out.println(b);
        rec(a,b+1);
    }

    static boolean pow(int n) {
        if (n == 0) return false; else if (n == 1) return true; else
        return pow(n/2);    }
}