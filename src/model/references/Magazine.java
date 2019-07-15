package model.references;

public class Magazine extends ReferencesModel {

    private String author;
    
    public Magazine(){}

    public Magazine(int referenceNumber, String referenceType, String title, String publisher, int maxBorrowDays, boolean isAvailable, int penaltyFee) {
        super(referenceNumber, referenceType, title, publisher, maxBorrowDays, isAvailable, penaltyFee);

    }

}
