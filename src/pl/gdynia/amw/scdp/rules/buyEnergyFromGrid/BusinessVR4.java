package pl.gdynia.amw.scdp.rules.buyEnergyFromGrid;

import org.jetbrains.annotations.NotNull;
import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;

public class BusinessVR4 implements VerificationRule {
    @Override
    public boolean runRule(@NotNull Transaction t){
        if (t.getTargetBatteryEnergySurplus() == 0.0) {
            System.out.println(BusinessVR4.class.getName() + " - targetBatteryEnergySurplus == 0 ");
            return true;
        } else {
            System.out.println(BusinessVR4.class.getName() + " - targetBatteryEnergySurplus != 0");
            return false;
        }
    }
}