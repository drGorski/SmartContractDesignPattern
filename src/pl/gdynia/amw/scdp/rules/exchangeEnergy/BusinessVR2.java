/*
  BusinessVR2 class of concrete verification rule
  implements VerificationRule interface

  @author  Tomasz Górski
  @version 1.0
  @since   2021-12-25
 */
package pl.gdynia.amw.scdp.rules.exchangeEnergy;

import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;

public class BusinessVR2 implements VerificationRule {
    public boolean runRule(Transaction t){
        System.out.println("BusinessVR2 - sourceSurplus >= quantity");
        return t.getSourceSurplus() >= t.getQuantity();
    }
}
