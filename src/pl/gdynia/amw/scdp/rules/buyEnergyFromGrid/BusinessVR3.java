package pl.gdynia.amw.scdp.rules.buyEnergyFromGrid;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;

public class BusinessVR3 implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        if ((t.getTargetProduction() + t.getTargetBatteryEnergySurplus()) < t.getTargetNeed()) {
            System.out.println(BusinessVR3.class.getName() + " - targetProduction + battery < targetNeed");
            return true;
        } else {
            System.out.println(BusinessVR3.class.getName() + " - targetProduction + battery >= targetNeed");
            return false;
        }
    }
}
