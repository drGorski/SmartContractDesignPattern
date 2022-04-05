/*
  ExpandingVR1 class
  Concrete verification rule that implements VerificationRule interface.

  @author  Tomasz Górski
  @version 1.0
  @since   2021-12-25

  Possibility to activate verification rule for smart contract amendment:
       public boolean runRule(Transaction t){
        if ( t.getSourceCommunityID() != t.getTargetCommunityID()
                && t.getTargetNeed() >= t.getQuantity()) {
            System.out.println("ExpandingVR1 - positive");
            return true;
        } else {
            System.out.println("ExpandingVR1 - negative");
            return false;
        }
    }
  Standard:
      public boolean runRule(Transaction t){
        return true;
    }
 */
package pl.gdynia.amw.scdp.rules.exchangeEnergy;

import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;

public final class ExpandingVR1 implements VerificationRule {
    @Override
    public boolean runRule(Transaction t){ return true; }
}
