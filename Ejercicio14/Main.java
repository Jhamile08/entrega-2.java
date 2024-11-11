package Ejercicio14;

public class Main {
    public static void main(String[] args) {
        Payment target = new TargetPay("1234567812345678", "Juan Pérez", "12/25", "123");
        target.payProcess(22.22);

        Payment cash = new CashPay();
        cash.payProcess(222.0);
    }
}
