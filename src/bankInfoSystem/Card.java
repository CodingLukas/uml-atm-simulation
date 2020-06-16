package bankInfoSystem;

public class Card {

    private final int cardNumber;
    private final int pin;

    Card( int cardNumber, int pin ) 
        {
        this.cardNumber = cardNumber;
        this.pin = pin;
        }

    public int getPin() {
        return pin;
    }

    public int getCardNumber() {
        return cardNumber;
    }


}
