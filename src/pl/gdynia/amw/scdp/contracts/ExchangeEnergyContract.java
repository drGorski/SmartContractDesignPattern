/*
  ExchangeEnergyContract class
  Concrete smart contract class that implements SmartContract abstract class.

  @author  Tomasz Górski
  @version 1.0
  @since   2021-12-25
*/
package pl.gdynia.amw.scdp.contracts;

import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;
import pl.gdynia.amw.scdp.rules.exchangeEnergy.*;
import pl.gdynia.amw.scdp.rules.exchangeEnergy.crossCommunity.ExpandingVR1Extended;
import pl.gdynia.amw.scdp.rules.exchangeEnergy.crossCommunity.TechnicalVR1Extended;

import java.util.Arrays;

public final class ExchangeEnergyContract extends SmartContract {

    public ExchangeEnergyContract(){
        // array-backed list of verification rules
        rulesList = Arrays.asList(
                new TechnicalVR1(),
                new TechnicalVR2(),
                new BusinessVR1(),
                new BusinessVR2(),
                new ExpandingVR1());
    }

    public void populateRulesStandard(){
        // populates array-backed list of verification rules
        rulesList = Arrays.asList(
                new TechnicalVR1(),
                new TechnicalVR2(),
                new BusinessVR1(),
                new BusinessVR2(),
                new ExpandingVR1());
    }

    public void populateRulesExtended(){
        // populates array-backed list of verification rules
        rulesList = Arrays.asList(
                new TechnicalVR1Extended(),
                new TechnicalVR2(),
                new BusinessVR1(),
                new BusinessVR2(),
                new ExpandingVR1Extended());
    }

    @Override
    public boolean checkSC(Transaction tr){
        boolean correct = false;
        for (VerificationRule vR : rulesList) {
            correct = vR.runRule(tr);
            if (!correct) break;
        }
        return correct;
    }
}
