package day37__Static.DebitCard;

public class DebitCard {
    long cardNumber;
    String name;
    String type;
    int pin;
    double balance;

    static String accountType = "debit";

    static {

        System.out.println("Account type: " + accountType);

    }


    public DebitCard(long cardNumber, String name, String type, int pin, double balance) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.type = type;
        this.pin = pin;
        this.balance = balance;
    }

    public DebitCard(long cardNumber, String name, double balance) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.balance = balance;
    }


    public String toString() {
        return "DebitCard{" +
                "cardNumber=" + cardNumber +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }

    public void invalidCardNumber() {
        String cardNumberStr = cardNumber + "";
        if (cardNumberStr.length() != 16) {
            System.out.println("Card number is Invalid");
        } else {
            System.out.println("Valid Card number");
        }
    }

    public void invalidPin() {
        if (pin < 9999 && pin > 999) {
            System.out.println("Valid Pin number");
        } else {
            System.out.println("Invalid Pin length");
        }
    }
}

