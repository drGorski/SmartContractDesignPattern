package pl.gdynia.amw.scdp.rules.exchangeEnergy;

import org.junit.jupiter.api.Test;
import pl.gdynia.amw.scdp.Transaction;

import static org.junit.jupiter.api.Assertions.*;

class TechnicalVR2Test {
    TechnicalVR2 technicalVR2 = new TechnicalVR2();
    @Test
    void runRulePositive() {
        Transaction tr = new Transaction(100, 300, 400, 1001, 1002, 100, 100);
        assertTrue(technicalVR2.runRule(tr));
    }
    @Test
    void runRuleNegative() {
        Transaction tr = new Transaction(100, 50, 400, 1001, 1001, 100, 100);
        assertFalse(technicalVR2.runRule(tr));
    }
}
