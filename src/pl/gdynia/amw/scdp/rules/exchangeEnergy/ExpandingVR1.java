/*
  ExpandingVR1 class of concrete verification rule
  implements VerificationRule interface

  @author  Tomasz Górski
  @version 1.0
  @since   2021-12-25
 */
package pl.gdynia.amw.scdp.rules.exchangeEnergy;

import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;

public class ExpandingVR1 implements VerificationRule {
    public boolean runRule(Transaction t){
        return true;
        //System.out.println("ExpandingVR1 - targetNeed >= quantity");
        //return t.getTargetNeed() >= t.getQuantity();
    }
}
