package javaMiniProj;

import java.util.Date;

public class Magazine extends References {
	private String author;
	private int volumeNo;
	private int issueNo;
	
	public Magazine(String referenceTitle, String author, int volumeNo, int issueNo, String itemType, boolean isAvailable, int daysBorrowed, Date dateBorrowed, Date dateReturned) {
		super(referenceTitle, itemType, 5, isAvailable, daysBorrowed, dateBorrowed, dateReturned);
		this.author = author;
		this.volumeNo = volumeNo;
		this.issueNo = issueNo;
	}

}
