package javaMiniProj;

import java.util.Date;

public class ACTIONReference extends References {
	private int version;
	private String author;
	private int volumeNo;
	private int issueNo;
	private String refPublisher;
	private static int penaltyFee = 10;
	private static int replacementFee = 1000;
	
	//a comment
	public ACTIONReference(String referenceTitle, int version, String author, int volumeNo, int issueNo, String refPublisher, String itemType, boolean isAvailable, int daysBorrowed, Date dateBorrowed, Date dateReturned) {
		super(referenceTitle, itemType, 150, isAvailable, daysBorrowed, dateBorrowed, dateReturned);
		this.version = version;
		this.author = author;
		this.volumeNo = volumeNo;
		this.issueNo = issueNo;
		this.refPublisher = refPublisher;
	}
}
