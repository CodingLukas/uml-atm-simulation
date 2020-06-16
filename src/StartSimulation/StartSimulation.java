package StartSimulation;

import atm.ATM;
import bankInfoSystem.BankInfoSystem;

public class StartSimulation {

//        BankInfoSystem bankInfoSystem = new BankInfoSystem();
//        ATM atm;

    public static void main(String[] args) 
        {
        BankInfoSystem bankInfoSystem = new BankInfoSystem();
        ATM atm; // local variable
        atm = new ATM( bankInfoSystem );
        atm.run();
        }
    
//        void n()
//        {
//         atm = new ATM();
//            atm.run();   
//        }
}
