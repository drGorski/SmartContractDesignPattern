package pl.gdynia.amw.scdp.contracts;

import org.junit.jupiter.api.Test;
import pl.gdynia.amw.scdp.Transaction;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeEnergyContractTest {

    @Test
    void checkSCPositive() {
        SmartContract sC = new ExchangeEnergyContract();
        Transaction tr = new Transaction(100, 300, 400, 1001, 1002, 100, 100);

        assertTrue(sC.checkSC(tr));
    }

    @Test
    void checkSCNegativeTVR1() {
        SmartContract sC = new ExchangeEnergyContract();
        Transaction tr = new Transaction(100, 300, 400, 1001, 1001, 100, 100);

        assertFalse(sC.checkSC(tr));
    }

    @Test
    void checkSCNegativeBVR1() {
        SmartContract sC = new ExchangeEnergyContract();
        Transaction tr = new Transaction(0, 300, 400, 1001, 1001, 100, 100);

        assertFalse(sC.checkSC(tr));
    }

    @Test
    void checkSCNegativeBVR2() {
        SmartContract sC = new ExchangeEnergyContract();
        Transaction tr = new Transaction(100, 80, 400, 1001, 1001, 100, 100);

        assertFalse(sC.checkSC(tr));
    }
}