package Ejercicio14;

public class TargetPay extends Payment {

    private String targetNum;

    private String nameHolder;
    private String expirationDate;
    private String cvv;

    public TargetPay(String targetNum, String nameHolder, String expirationDate, String cvv) {
        this.targetNum = targetNum;
        this.nameHolder = nameHolder;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void payProcess(Double amount) {
        System.out.println("Your procces is going to be procces with target");
        System.out.println("amount: $" + amount);
        System.out.println("name's target " + nameHolder);
        System.out.println("target number: **** **** **** " + targetNum.substring(targetNum.length() - 4));
        System.out.println("the payment was succesful.");
    }

}
