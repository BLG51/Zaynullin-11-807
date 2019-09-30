public class Money {
    private long rub;
    private byte kop;

    Money(long rub, int kop) {
        try {
            if (rub < 0 || kop > 99 || kop < 0) {
                throw new Exception("Invalid parameters");
            }
            this.rub = rub;
            this.kop = (byte) kop;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public long getRub() {
        return rub;
    }

    public byte getKop() {
        return kop;
    }

    public void add(Money money) {
        rub += money.getRub() + (kop + money.getKop()) / 100;
        kop = (byte) ((kop + money.getKop()) % 100);
    }

    public void sub(Money money) {
        try {
            if (rub < money.getRub() || (kop < money.getKop() && rub == money.getRub())) {
                throw new Exception("Invalid parameters");
            }
            rub -= money.getRub();
            if (kop < money.getKop()) {
                rub--;
                kop = (byte) (kop + 100 - money.getKop());
            } else {
                kop = (byte) (kop - money.getKop());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mult(int digit) {
        try {
            if (digit < 0) {
                throw new Exception("Invalid parameters");
            }
            rub = rub * digit + (kop * digit) / 100;
            kop = (byte) ((kop * digit) % 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isMoreOrEqualThan(Money money) {
        if (rub > money.getRub()) {
            return true;
        } else if (rub == money.getRub()) {
            if (kop >= money.getKop()) {
                return true;
            } else return false;
        } else return false;
    }

    @Override
    public String toString() {
        return rub + "," + kop;
    }
}
