package pl.gdynia.amw.scdp.rules.exchangeEnergy.crossCommunity;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import pl.gdynia.amw.scdp.TransactionCross;

class TechnicalVR1ExtendedTest {
    TechnicalVR1Extended technicalVR1Extended = new TechnicalVR1Extended();

    @org.junit.jupiter.api.Test
    void runRulePositive() {
        TransactionCross tr = new TransactionCross(100, 300, 400, 20,10,1001, 1002, 100, 101);
        assertTrue(technicalVR1Extended.runRule(tr));
    }
    @org.junit.jupiter.api.Test
    void runRuleNegative() {
        TransactionCross tr = new TransactionCross(100, 300, 400, 20,10,1001, 1002, 100, 100);
        assertFalse(technicalVR1Extended.runRule(tr));
    }
}