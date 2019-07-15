package model.references;

public abstract class ReferencesModel {

    private int referenceNumber, daysBorrowed, maxBorrowDays, penaltyfee, dateBorrowed, dateReturned;
    private boolean isAvailable;
    private String title, publisher, referenceType;

    public ReferencesModel() {
    }

    public ReferencesModel(int referenceNumber, String referenceType, String title, String publisher, int maxBorrowDays, boolean isAvailable, int penaltyFee) {
        this.referenceNumber = referenceNumber;
        this.referenceType = referenceType;
        this.title = title;
        this.publisher = publisher;
        this.maxBorrowDays = maxBorrowDays;
        this.isAvailable = isAvailable;
        this.penaltyfee = penaltyFee;
    }

    // reference number
    public int getReferenceNumber() {
        return this.referenceNumber;
    }

    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    // reference type
    public String getReferenceType() {
        return this.referenceType;
    }

    public void setReferenceType() {
        this.referenceType = referenceType;
    }

    // title
    public String getTitle() {
        return this.title;
    }

    public void setTitle() {
        this.title = title;
    }

    // days borrowed
    public int getDaysBorrowed() {
        return this.dateBorrowed;
    }

    public void setDaysBorrowed(int daysBorrowed) {
        this.daysBorrowed = daysBorrowed;
    }

    // publisher
    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // max borrow days
    public int getMaxBorrowDays() {
        return this.maxBorrowDays;
    }

    public void setMaxBorrowDays(int maxBorrowDays) {
        this.maxBorrowDays = maxBorrowDays;
    }

    // availability
    public boolean getAvailability() {
        return this.isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // penalty fee
    public int getPenaltyFee() {
        return this.penaltyfee;
    }

    public void setPenaltyFee(int penaltyFee) {
        this.penaltyfee = penaltyfee;
    }

}
