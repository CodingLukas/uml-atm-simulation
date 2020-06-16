package atm;

import bankInfoSystem.BankInfoSystem;

public class ATM 
    {
    private final Screen screen; //= new Screen(); // field
    private final Keypad keypad = new Keypad();
//    int i = 1;
    
    private final BankInfoSystem bankInfoSystem;
//    private int cardNumber;
    private Authentication authentication; // field
//    Authentication authentication = new Authentication();

    public ATM(BankInfoSystem bankInfoSystem) 
        {
//        i = 2;
        this.bankInfoSystem = bankInfoSystem;
        
        screen = new Screen();
        
        }

//    ATM() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public void run()
        {
        // Cash dispenser replenishment
        while ( true )
            runSession();
        
        }

    private void runSession() 
        {
        authentication = new Authentication( );
        authentication.login( bankInfoSystem, screen, keypad );
        // Select and execute transaction
        Integer cardNumber = authentication.getCardNumber();
//        executeBalanceInquiry( cardNumber );
//        executeBalanceInquiry( authentication.getCardNumber() );
        authentication.logout( screen );
//        authentication = null;

        }

}