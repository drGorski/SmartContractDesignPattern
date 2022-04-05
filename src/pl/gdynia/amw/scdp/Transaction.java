/*
  Transaction class - encompasses energy exchange among prosumer communities.

  @author  Tomasz Górski
  @version 1.0
  @since   2021-12-25
 */

package pl.gdynia.amw.scdp;

public class Transaction {
    private double quantity;
    private double sourceSurplus;
    private double targetNeed;
    private int sourceID;
    private int targetID;
    private int sourceCommunityID;
    private int targetCommunityID;

    public Transaction(double quantity, double sSurplus, double tNeed,
                       int sID, int tID, int sCID, int tCID) {
        this.quantity = quantity;
        this.sourceSurplus = sSurplus;
        this.targetNeed = tNeed;
        this.sourceID = sID;
        this.targetID = tID;
        this.sourceCommunityID = sCID;
        this.targetCommunityID = tCID;
    }
    public double getQuantity() {
        return quantity;
    }
    public double getSourceSurplus() {
        return sourceSurplus;
    }
    public double getTargetNeed() {
        return targetNeed;
    }
    public int getSourceID() {
        return sourceID;
    }
    public int getTargetID() {
        return targetID;
    }
    public int getSourceCommunityID() {
        return sourceCommunityID;
    }
    public int getTargetCommunityID() {
        return targetCommunityID;
    }
}
