package pl.gdynia.amw.scdp.rules.exchangeEnergy;

import org.junit.jupiter.api.Test;
import pl.gdynia.amw.scdp.Transaction;

import static org.junit.jupiter.api.Assertions.*;

class BusinessVR2Test {

    @Test
    void runRulePositive() {
        BusinessVR2 businessVR2 = new BusinessVR2();
        Transaction tr = new Transaction(100, 300, 400, 1001, 1002, 100, 100);

        assertTrue(businessVR2.runRule(tr));
    }

    @Test
    void runRuleNegative() {
        BusinessVR2 businessVR2 = new BusinessVR2();
        Transaction tr = new Transaction(100, 50, 400, 1001, 1002, 100, 100);

        assertFalse(businessVR2.runRule(tr));
    }
}