package pl.gdynia.amw.scdp.rules.exchangeEnergy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.gdynia.amw.scdp.Transaction;

import static org.junit.jupiter.api.Assertions.*;

class BusinessVR1Test {

    @Test
    void runRulePositive() {
        BusinessVR1 businessVR1 = new BusinessVR1();
        Transaction tr = new Transaction(100, 300, 400, 1001, 1002, 100, 100);

        assertTrue(businessVR1.runRule(tr));
    }

    @Test
    void runRuleNegative() {
        BusinessVR1 businessVR1 = new BusinessVR1();
        Transaction tr = new Transaction(0, 300, 400, 1001, 1002, 100, 100);

        assertFalse(businessVR1.runRule(tr));
    }
}