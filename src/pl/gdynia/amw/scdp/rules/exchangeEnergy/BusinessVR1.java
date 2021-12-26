/*
  BusinessVR1 class of concrete verification rule
  implements VerificationRule interface

  @author  Tomasz Górski
  @version 1.0
  @since   2021-12-25
 */
package pl.gdynia.amw.scdp.rules.exchangeEnergy;

import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;

public class BusinessVR1 implements VerificationRule {
    public boolean runRule(Transaction t){
        System.out.println("BusinessVR1 - quantity > 0");
        return t.getQuantity() > 0;
    }
}
