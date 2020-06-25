package atm;

import bankInfoSystem.BankInfoSystem;
import bankInfoSystem.Card;
import operations.BalanceInquiry;

public class ATM 
    {
    private final Screen screen; //= new Screen(); // field
    private final Keypad keypad = new Keypad();
//    int i = 1;
    
    private final BankInfoSystem bankInfoSystem;
//    private int cardNumber;
    private Authentication authentication; // field
//    Authentication authentication = new Authentication();
    private BalanceInquiry balanceInquiry; // field

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
        Integer cardNumber = authentication.getCardNumber();
        balanceInquiry = new BalanceInquiry(cardNumber);
        // Select and execute transaction
        executeMainMenu();
        authentication.logout( screen );
        authentication = null;
        balanceInquiry = null;
        }
    
    private void executeMainMenu(){
        while(true){
            screen.displayMessage("Main menu\n");
            screen.displayMessage("1 - View my balance\n");
            screen.displayMessage("2 - Withdraw cash\n");
            screen.displayMessage("3 - Deposit funds\n");
            screen.displayMessage("4 - Exit\n");
            screen.displayMessage("Enter a choice:\n");
            int input = keypad.getInput();
            switch(input){
                case 1:
                    executeBalanceInquiry();
                    break;
                case 4:
                    screen.displayMessage("Thank you.\n");
                    return;
                default:
                    screen.displayMessage("To be implemented. Choose other option\n");
                    break;
            }
        }
    }
    
    private void executeBalanceInquiry(){
        balanceInquiry.execute(screen,bankInfoSystem);
    }

}