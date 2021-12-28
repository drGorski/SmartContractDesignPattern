/*
  @author  Tomasz Górski
  @version 1.0
  @since   2021-12-25
 */

package pl.gdynia.amw.scdp.rules;

import pl.gdynia.amw.scdp.Transaction;

public interface VerificationRule {
    boolean runRule(Transaction tr);
}

