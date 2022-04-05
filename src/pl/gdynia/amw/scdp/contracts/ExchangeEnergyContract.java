/*
  ExchangeEnergyContract class
  Concrete smart contract class that implements SmartContract abstract class.

  @author  Tomasz Górski
  @version 1.0
  @since   2021-12-25
*/
package pl.gdynia.amw.scdp.contracts;

import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.TransactionCross;
import pl.gdynia.amw.scdp.rules.VerificationRule;
import pl.gdynia.amw.scdp.rules.exchangeEnergy.*;
import pl.gdynia.amw.scdp.rules.exchangeEnergy.crossCommunity.*;

import java.util.Arrays;

public final class ExchangeEnergyContract extends SmartContract {

    public ExchangeEnergyContract(){
        populateRulesStandard();
    }

    private void populateRulesStandard(){
        // populates array-backed list of verification rules
        rulesList = Arrays.asList(
                new TechnicalVR1(),
                new TechnicalVR2(),
                new BusinessVR1(),
                new BusinessVR2(),
                new ExpandingVR1());
    }

    private void populateRulesExtended(){
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
        populateRulesStandard();
        return check(tr);
    }

    public boolean checkSC(TransactionCross tr){
        populateRulesExtended();
        return check(tr);
    }

    private boolean check(Transaction tr){
        boolean correct = false;
        for (VerificationRule vR : rulesList) {
            correct = vR.runRule(tr);
            if (!correct) break;
        }
        return correct;
    }
}
