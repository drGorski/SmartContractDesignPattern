/*
  ExpandingVR1Extended
  Concrete verification rule that implements VerificationRule interface.

  @author  Tomasz Górski
  @version 1.1
  @since   2022-04-05
 */
package pl.gdynia.amw.scdp.rules.exchangeEnergy.crossCommunity;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;

public final class ExpandingVR1Extended implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        if (t.getTargetNeed() >= t.getQuantity()) {
            System.out.println("ExpandingVR1Extended - targetNeed >= quantity");
            return true;
        } else {
            System.out.println("ExpandingVR1Extended - targetNeed < quantity");
            return false;
        }
    }
}