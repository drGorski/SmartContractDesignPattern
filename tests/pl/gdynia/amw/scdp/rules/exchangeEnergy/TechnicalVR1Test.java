package pl.gdynia.amw.scdp.rules.exchangeEnergy;

import org.junit.jupiter.api.Test;
import pl.gdynia.amw.scdp.Transaction;

import static org.junit.jupiter.api.Assertions.*;

class TechnicalVR1Test {
    TechnicalVR1 technicalVR1 = new TechnicalVR1();
    @Test
    void runRulePositive() {
        Transaction tr = new Transaction(100, 300, 400, 20, 10, 1001, 1002, 100, 100);
        assertTrue(technicalVR1.runRule(tr));
    }
    @Test
    void runRuleNegative() {
        Transaction tr = new Transaction(100, 300, 400, 20, 10, 1001, 1002, 100, 200);
        assertFalse(technicalVR1.runRule(tr));
    }
}