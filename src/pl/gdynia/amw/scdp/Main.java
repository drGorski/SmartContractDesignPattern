/*
  Smart Contract Design Pattern - main class for testing purposes.

  @author  Tomasz Górski
  @version 1.1
  @since   2022-04-05
 */
package pl.gdynia.amw.scdp;

import pl.gdynia.amw.scdp.contracts.ExchangeEnergyContract;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // variables declaration, initialization and instantiation
        boolean correct;
        boolean repeat;
        Scanner scanS = new Scanner(System.in);
        Transaction tr;
        TransactionCross trC;
        ExchangeEnergyContract sC = new ExchangeEnergyContract();

        do {
            System.out.println(" 1 - transaction within community");
            System.out.println(" 2 - transaction cross-community");
            if (scanS.nextLine().equalsIgnoreCase("1")) {
                // new transaction in community
                tr = new Transaction(100, 300, 400, 20, 10, 1001, 1002, 100, 100);
                // verification of transaction
                correct = sC.checkSC(tr);
            } else {
                // new transaction cross-community
                trC = new TransactionCross(100, 300, 400, 20,10,1001, 1002, 100, 101);
                // verification of transaction
                correct = sC.checkSC(trC);
            }
            System.out.println("Smart contract verification: " + (correct ? "PASS" : "FAIL"));
            System.out.println("Check again? (Y/N)");
            repeat = scanS.nextLine().equalsIgnoreCase("Y");
        } while (repeat);
    }
}
