package pl.gdynia.amw.scdp.contracts;

import org.junit.jupiter.api.Test;
import pl.gdynia.amw.scdp.Transaction;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeEnergyContractTest {
    SmartContract sC = new ExchangeEnergyContract();
    @Test
    void checkSCPositive() {
        Transaction tr = new Transaction(100, 300, 400, 1001, 1002, 100, 100);
        assertTrue(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeTVR1() {
        Transaction tr = new Transaction(100, 300, 400, 1001, 1001, 100, 100);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeBVR1() {
        Transaction tr = new Transaction(0, 300, 400, 1001, 1002, 100, 100);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeBVR2() {
        Transaction tr = new Transaction(100, 80, 400, 1001, 1002, 100, 100);
        assertFalse(sC.checkSC(tr));
    }
}