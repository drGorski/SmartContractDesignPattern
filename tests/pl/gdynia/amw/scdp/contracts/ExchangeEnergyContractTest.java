package pl.gdynia.amw.scdp.contracts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import pl.gdynia.amw.scdp.Transaction;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeEnergyContractTest {
    SmartContract sC = new ExchangeEnergyContract();
    Transaction tr;

    @Test
    void checkSCPositive() {
        tr = new Transaction(100, 300, 400, 1001, 1002, 100, 100);
        assertTrue(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeTVR1() {
        tr = new Transaction(100, 300, 400, 1001, 1001, 100, 100);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeBVR1() {
        tr = new Transaction(0, 300, 400, 1001, 1002, 100, 100);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeBVR2() {
        tr = new Transaction(100, 80, 400, 1001, 1002, 100, 100);
        assertFalse(sC.checkSC(tr));
    }
    @AfterEach
    void clear() {
        tr = null;
    }
}