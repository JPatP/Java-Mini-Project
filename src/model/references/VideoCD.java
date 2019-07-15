package model.references;

public class VideoCD extends ReferencesModel {

    private static int runTime;

    public VideoCD() {
    }

    public VideoCD(int referenceNumber, String referenceType, String title, String publisher, int maxBorrowDays, boolean isAvailable, int penaltyFee, int runtime) {
        super(referenceNumber, referenceType, title, publisher, maxBorrowDays, isAvailable, penaltyFee);
        this.runTime = runtime;

    }

    public int getRunTime() {
        return this.runTime;
    }

    public void setRunTime() {
        this.runTime = runTime;
    }

}
