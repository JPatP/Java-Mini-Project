package model.references;

public class ActionReference extends ReferencesModel {

    private String author;

    public ActionReference(int referenceNumber, String referenceType, String title, String publisher, int maxBorrowDays, boolean isAvailable, int penaltyFee, String author) {
        super(referenceNumber, referenceType, title, publisher, maxBorrowDays, isAvailable, penaltyFee);
        this.author = author;

    }

    // author
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor() {
        this.author = author;
    }

}
