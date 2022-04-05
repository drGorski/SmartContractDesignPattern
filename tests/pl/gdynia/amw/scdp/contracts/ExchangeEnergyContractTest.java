package pl.gdynia.amw.scdp.contracts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pl.gdynia.amw.scdp.Transaction;

class ExchangeEnergyContractTest {
    SmartContract sC = new ExchangeEnergyContract();
    @Test
    void checkSCPositive() {
        System.out.println("--- checkSCPositive");
        Transaction tr = new Transaction(100, 300, 400, 1001, 1002, 100, 100);
        assertTrue(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeTVR1() {
        System.out.println("--- checkSCNegativeTVR1");
        Transaction tr = new Transaction(100, 300, 400, 1001, 1002, 100, 200);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeTVR2() {
        System.out.println("--- checkSCNegativeTVR2");
        Transaction tr = new Transaction(100, 300, 400, 1001, 1001, 100, 200);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeBVR1() {
        System.out.println("--- checkSCNegativeBVR1");
        Transaction tr = new Transaction(0, 300, 400, 1001, 1002, 100, 100);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCNegativeBVR2() {
        System.out.println("--- checkSCNegativeBVR2");
        Transaction tr = new Transaction(100, 80, 400, 1001, 1002, 100, 100);
        assertFalse(sC.checkSC(tr));
    }
}