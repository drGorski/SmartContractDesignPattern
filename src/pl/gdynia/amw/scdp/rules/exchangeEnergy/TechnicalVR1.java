/*
  TechnicalVR1 class of concrete verification rule
  implements VerificationRule interface

  @author  Tomasz Górski
  @version 1.0
  @since   2021-12-25
 */
package pl.gdynia.amw.scdp.rules.exchangeEnergy;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;

public final class TechnicalVR1 implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        System.out.println("TechnicalVR1 - sourceID != targetID");
        return t.getSourceID() != t.getTargetID();
    }
}
