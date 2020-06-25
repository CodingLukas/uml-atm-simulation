/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import atm.Screen;
import bankInfoSystem.BankInfoSystem;

/**
 *
 * @author lukas
 */
public class BalanceInquiry {
    
    private final int accountNumber;
    
    public BalanceInquiry(int accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public void execute(Screen screen, BankInfoSystem bankInfoSystem){
        double balance = bankInfoSystem.getBalance(accountNumber);
        String message = String.format("\nYour current balance is %s\n",balance);
        screen.displayMessage( message );
    }
   
}
