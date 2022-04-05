package pl.gdynia.amw.scdp.rules.exchangeEnergy.crossCommunity;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import pl.gdynia.amw.scdp.TransactionCross;

class ExpandingVR1ExtendedTest {
    ExpandingVR1Extended expandingVR1Extended = new ExpandingVR1Extended();

    @Test
    void runRulePositive() {
        TransactionCross tr = new TransactionCross(100, 300, 400, 20,10,1001, 1002, 100, 100);
        assertTrue(expandingVR1Extended.runRule(tr));
    }

    @Test
    void runRuleNegative() {
        TransactionCross tr = new TransactionCross(100, 300, 50, 20,10,1001, 1002, 100, 100);
        assertFalse(expandingVR1Extended.runRule(tr));
    }
}