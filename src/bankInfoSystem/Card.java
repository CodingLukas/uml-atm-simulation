package bankInfoSystem;

public class Card {

    private final int cardNumber;
    private final int pin;
    private double balance = 0;

    Card( int cardNumber, int pin, double balance ) 
        {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
        }

    public int getPin() {
        return pin;
    }

    public int getCardNumber() {
        return cardNumber;
    }
    
    public double getBalance() {
        return balance;  
    }

}
