package javaMiniProj;

import java.util.Date;

public abstract class References {
	private static int count;
	private int referenceNumber;
	private int maxBorrowDays;
	private String referenceTitle;
	private int daysBorrowed;
	private boolean isAvailable;
	private Date dateBorrowed;
	private Date dateReturned;
	private String itemType;	
	
	public References(String referenceTitle, String itemType, int maxBorrowDays, boolean isAvailable, int daysBorrowed, Date dateBorrowed, Date dateReturned){
		count++;
		this.referenceNumber = count;
		this.referenceTitle = referenceTitle;
		this.itemType = itemType;
		this.isAvailable = isAvailable;
		this.daysBorrowed = daysBorrowed;
		this.dateBorrowed = dateBorrowed;
		this.dateReturned = dateReturned;
	}
	
	public void returnReference(){
		
	}
	
	
	public String searchReference(String titleQuery){
		return this.referenceTitle;
	}
	
	
	public void borrowReference(){
		
	}
	
	
	public String getItemType(){
		return this.itemType;
	}
	
	
	public String getTitle(){
		return this.referenceTitle;
	}
	
	
	public void displayInfo(){
		System.out.println("Ref. No.       : " + this.referenceNumber);
		System.out.println("Title          : " + this.referenceTitle);
		System.out.println("Item Type      : " + this.itemType);
		System.out.println("Max Borrow Days: " + this.maxBorrowDays);
	}
}
