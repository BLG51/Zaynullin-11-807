import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0, b;
        String s, res = "y";
        while (true) {
            if (res.equals("y")) {
                System.out.println("Введите число");
                a = sc.nextDouble();
            }
            System.out.println("Введите оператор");
            s = sc.next();
            System.out.println("Введите оператор");
            b = sc.nextDouble();
            switch (s) {
                case "*":
                    a = a * b;
                    break;
                case "/":
                    a = a / b;
                    break;
                case "+":
                    a = a + b;
                    break;
                case "-":
                    a = a - b;
                    break;
            }
            System.out.println("Результат: " + a);
            System.out.println("Сбросить результат y/n");
            res = sc.next();
        }
    }
}
