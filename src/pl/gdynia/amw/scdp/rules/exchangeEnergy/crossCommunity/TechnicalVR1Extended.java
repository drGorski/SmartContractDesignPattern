/*
  TechnicalVR1Extended
  Concrete verification rule that implements VerificationRule interface.

  @author  Tomasz Górski
  @version 1.1
  @since   2022-04-05
 */
package pl.gdynia.amw.scdp.rules.exchangeEnergy.crossCommunity;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;

public final class TechnicalVR1Extended implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        if (t.getSourceCommunityID() != t.getTargetCommunityID()) {
            System.out.println("TechnicalVR1Extended - cross-community exchange");
            return true;
        } else {
            System.out.println("TechnicalVR1Extended - the same community");
            return false;
        }
    }
}
