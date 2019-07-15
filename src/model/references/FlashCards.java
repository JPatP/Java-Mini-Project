package model.references;

public class FlashCards extends ReferencesModel {

    public FlashCards() {
    }

    public FlashCards(int referenceNumber, String referenceType, String title, String publisher, int maxBorrowDays, boolean isAvailable, int penaltyFee) {
        super(referenceNumber, referenceType, title, publisher, maxBorrowDays, isAvailable, penaltyFee);

    }

}
