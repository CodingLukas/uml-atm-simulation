package atm;

import bankInfoSystem.BankInfoSystem;

public class Authentication 
    {
//    private boolean isConnected; // false = disconnected
    private Integer cardNumber;    // null = disconnected
    
//    private final Screen screen;
//    private final Keypad keypad;
//    private final BankInfoSystem bankInfoSystem;

//    Authentication( BankInfoSystem bankInfoSystem, Screen screen, Keypad keypad ) 
//        {
//        this.bankInfoSystem = bankInfoSystem;
//        this.screen = screen;
//        this.keypad = keypad;
//        }

//    void login( BankInfoSystem bankInfoSystem, Screen screen, Keypad keypad ) 
    void login( BankInfoSystem bankInfoSystem, Screen screen, Keypad keypad ) 
        {
        boolean loginSuccess = false;
        while ( !loginSuccess )
            {
            String message = "\n\nWelcome - Please type your card number";
            screen.displayMessage( message );
            int cardNumberLogin = keypad.getInput();

            message = "\nPlease type your pin";
            screen.displayMessage( message );
            int pinLogin = keypad.getInput();

            loginSuccess = bankInfoSystem.authenticateCard( cardNumberLogin, pinLogin );

            if ( loginSuccess )
                {
                cardNumber = cardNumberLogin;
                message = "\nYou are now connected\n";
                screen.displayMessage( message );
                }
            else
                {
                message = "\nYour card number and/or pin were not correct. Please try again";
                screen.displayMessage( message );
                }
            }
        }

    void logout( Screen screen ) 
        {
        cardNumber = null;   // disconnected
        String message = "Please take your card. Bye-bye!";
        screen.displayMessage( message );
        }

    int getCardNumber() 
        {
        return cardNumber;
        }

}
