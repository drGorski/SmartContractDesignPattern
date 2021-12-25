/*
  @author  Tomasz Górski
  @version 1.0
  @since   2021-12-25
 */
package pl.gdynia.amw.scdp.contracts;

import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;
import pl.gdynia.amw.scdp.rules.exchangeEnergy.*;

import java.util.ArrayList;

public final class ExchangeEnergyContract extends SmartContract {

    public ExchangeEnergyContract(){
        // create object of rules list
        rulesList = new ArrayList<>();

        // populate list of verification rules
        rulesList.add(new TechnicalVR1());
        rulesList.add(new BusinessVR1());
        rulesList.add(new BusinessVR2());
        rulesList.add(new ExpandingVR1());
    }

    public boolean checkSC(Transaction tr){
        boolean correct = false;
        for (VerificationRule vR : rulesList) {
            correct = vR.runRule(tr);
            if (!correct) break;
        }
        return correct;
    }
}
