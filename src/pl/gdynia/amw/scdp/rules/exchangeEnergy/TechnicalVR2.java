/*
  TechnicalVR2 class
  Concrete verification rule that implements VerificationRule interface.

  @author  Tomasz Górski
  @version 1.0
  @since   2022-04-05
 */
package pl.gdynia.amw.scdp.rules.exchangeEnergy;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;

public final class TechnicalVR2 implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        if (t.getSourceID() != t.getTargetID()) {
            System.out.println("TechnicalVR2 - sourceID != targetID");
            return true;
        } else {
            System.out.println("TechnicalVR2 - sourceID == targetID");
            return false;
        }
    }
}
