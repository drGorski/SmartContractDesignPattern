/*
  Smart Contract Design Pattern main class
  for testing purposes

  @author  Tomasz Górski
  @version 1.0
  @since   2021-12-25
 */
package pl.gdynia.amw.scdp;

import pl.gdynia.amw.scdp.contracts.ExchangeEnergyContract;
import pl.gdynia.amw.scdp.contracts.SmartContract;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // variables declaration, initialization and instantiation
        boolean correct;
        boolean repeat;
        Scanner scanS = new Scanner(System.in);
        Transaction tr;
        SmartContract sC = new ExchangeEnergyContract();

        do {
            // new transaction
            tr = new Transaction(100, 300, 400, 1001, 1002, 100, 100);
            // verification of transaction
            correct = sC.checkSC(tr);
            System.out.println("Smart contract verification: " + (correct ? "PASS" : "FAIL"));

            System.out.println("Check again? (Y/N)");
            repeat = scanS.nextLine().equalsIgnoreCase("Y");
        } while (repeat);

    }
}
