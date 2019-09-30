public class SecondTaskMain {
    public static void main(String[] args) {
        Money[] moneyArr = new Money[10];
        for (int i = 0; i < moneyArr.length; i++) {
            moneyArr[i] = new Money(500, 29);
        }

        for (int i = 0; i < moneyArr.length; i++) {
            System.out.print(moneyArr[i] + " | ");
        }
        System.out.println();

        Money sum = new Money(0, 0);
        for (int i = 0; i < moneyArr.length; i++) {
            sum.add(moneyArr[i]);
        }
        System.out.println(sum);

        Money thousand = new Money(1000, 0);
        for (int i = 0; i < moneyArr.length; i++) {
            if (moneyArr[i].isMoreOrEqualThan(thousand)) System.out.println("Found one!");
        }
    }
}
