/*
  SmartContract abstract class

  @author  Tomasz Górski
  @version 1.0
  @since   2021-12-25
 */

package pl.gdynia.amw.scdp.contracts;

import pl.gdynia.amw.scdp.Transaction;
import pl.gdynia.amw.scdp.rules.VerificationRule;
import java.util.List;

public abstract sealed class SmartContract permits ExchangeEnergyContract, BuyEnergyFromGrid {
    // list of verification rules
    protected List<VerificationRule> rulesList;

    // verification of the smart contract
    public abstract boolean checkSC(Transaction tr);
}

