package bankInfoSystem;
import java.util.ArrayList;

public class BankInfoSystem 
    {
// field cards is a data structure which can have references to many Card objects   
    ArrayList<Card> cards = new ArrayList();

    public BankInfoSystem ()
        {
        Card card1 = new Card( 12345, 54321, 100 );
        Card card2 = new Card( 98765, 56789, 0 );
        
        cards.add(card1);
        cards.add(card2);
        
//        cards.add( new Card( 12345, 54321 ) );
        }

    public boolean authenticateCard( int cardNumberLogin, int pinLogin)
        {
/*      
        // initial implementation
            
        if ( ( (cardNumberLogin == 12345) && (pinLogin == 54321) )
          ||   ( (cardNumberLogin == 98765) && (pinLogin == 56789) ) ) 
            return true;
            else return false;
        }
*/

        // implementation using Card class    
        for ( Card card : cards )
            {
            if ( (card.getCardNumber() == cardNumberLogin ) 
                    && (card.getPin() == pinLogin ))
                {
               return true;
                }
            }
        return false;
        }
    
    public double getBalance(int accountNumber) {
         for ( Card card : cards )  
          if ( (card.getCardNumber() == accountNumber )) 
                 return card.getBalance();
          throw new RuntimeException();
    }

}
