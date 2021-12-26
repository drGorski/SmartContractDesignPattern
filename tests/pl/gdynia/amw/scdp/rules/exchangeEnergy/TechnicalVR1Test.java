package pl.gdynia.amw.scdp.rules.exchangeEnergy;

import org.junit.jupiter.api.Test;
import pl.gdynia.amw.scdp.Transaction;

import static org.junit.jupiter.api.Assertions.*;

class TechnicalVR1Test {

    @Test
    void runRulePositive() {
        TechnicalVR1 technicalVR1 = new TechnicalVR1();
        Transaction tr = new Transaction(100, 300, 400, 1001, 1002, 100, 100);

        assertTrue(technicalVR1.runRule(tr));
    }

    @Test
    void runRuleNegative() {
        TechnicalVR1 technicalVR1 = new TechnicalVR1();
        Transaction tr = new Transaction(100, 50, 400, 1001, 1001, 100, 100);

        assertFalse(technicalVR1.runRule(tr));
    }
}