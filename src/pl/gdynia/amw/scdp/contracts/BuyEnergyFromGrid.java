package pl.gdynia.amw.scdp.contracts;

import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.buyEnergyFromGrid.BusinessVR3;
import pl.gdynia.amw.scdp.rules.buyEnergyFromGrid.BusinessVR4;
import pl.gdynia.amw.scdp.rules.exchangeEnergy.BusinessVR1;
import pl.gdynia.amw.scdp.rules.exchangeEnergy.TechnicalVR2;
import java.util.Arrays;

public final class BuyEnergyFromGrid extends SmartContract{
     public BuyEnergyFromGrid(){
         // populates array-backed list of verification rules
         rulesList = Arrays.asList(
                 new TechnicalVR2(),
                 new BusinessVR1(),
                 new BusinessVR3(),
                 new BusinessVR4());
    }
    @Override
    public boolean checkSC(Transaction tr){
        return rulesList.get(0).runRule(tr) && rulesList.get(1).runRule(tr) && (rulesList.get(2).runRule(tr) | rulesList.get(3).runRule(tr));
    }
}