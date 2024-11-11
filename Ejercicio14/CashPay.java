package Ejercicio14;

public class CashPay extends Payment {

    @Override
    public void payProcess(Double amount) {
        System.out.println("Your pay is going to be procces with cash");
        System.out.println("amount: $" + amount);
        System.out.println("payment was succesfully.");
    }

}
