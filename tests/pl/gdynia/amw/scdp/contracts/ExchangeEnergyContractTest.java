package pl.gdynia.amw.scdp.contracts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.TransactionCross;

class ExchangeEnergyContractTest {
    ExchangeEnergyContract sC = new ExchangeEnergyContract();
    // in-community SC configuration
    @Test
    void checkSCInPositive() {
        System.out.println("--- checkSCInPositive");
        Transaction tr = new Transaction(100, 300, 400, 20, 10, 1001, 1002, 100, 100);
        assertTrue(sC.checkSC(tr));
    }
    @Test
    void checkSCInNegativeTVR1() {
        System.out.println("--- checkSCInNegativeTVR1");
        Transaction tr = new Transaction(100, 300, 400, 20, 10, 1001, 1002, 100, 200);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCInNegativeTVR2() {
        System.out.println("--- checkSCInNegativeTVR2");
        Transaction tr = new Transaction(100, 300, 400, 20, 10, 1001, 1001, 100, 100);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCInNegativeBVR1() {
        System.out.println("--- checkSCInNegativeBVR1");
        Transaction tr = new Transaction(0, 300, 400, 20, 10, 1001, 1002, 100, 100);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCInNegativeBVR2() {
        System.out.println("--- checkSCInNegativeBVR2");
        Transaction tr = new Transaction(100, 50, 400, 20, 10, 1001, 1002, 100, 100);
        assertFalse(sC.checkSC(tr));
    }
    // extended - cross-community SC configuration
    @Test
    void checkSCCrossPositive() {
        System.out.println("--- checkSCCrossPositive");
        TransactionCross tr = new TransactionCross(100, 300, 400, 20, 10, 1001, 1002, 100, 200);
        assertTrue(sC.checkSC(tr));
    }
    @Test
    void checkSCCrossNegativeTVR1Extended() {
        System.out.println("--- checkSCCrossNegativeTVR1Extended");
        TransactionCross tr = new TransactionCross(100, 300, 400, 20, 10, 1001, 1002, 100, 100);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCCrossNegativeTVR2() {
        System.out.println("--- checkSCCrossNegativeTVR2");
        TransactionCross tr = new TransactionCross(100, 300, 400, 20, 10, 1001, 1001, 100, 200);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCCrossNegativeBVR1() {
        System.out.println("--- checkSCCrossNegativeBVR1");
        TransactionCross tr = new TransactionCross(0, 300, 400, 20, 10, 1001, 1002, 100, 200);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCCrossNegativeBVR2() {
        System.out.println("--- checkSCCrossNegativeBVR2");
        TransactionCross tr = new TransactionCross(100, 50, 400, 20, 10, 1001, 1002, 100, 200);
        assertFalse(sC.checkSC(tr));
    }
    @Test
    void checkSCCrossNegativeEVR1Extended() {
        System.out.println("--- checkSCCrossNegativeEVR1Extended");
        TransactionCross tr = new TransactionCross(100, 300, 20, 20, 10, 1001, 1002, 100, 200);
        assertFalse(sC.checkSC(tr));
    }
}