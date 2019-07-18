package javaMiniProj;

import java.util.Date;

public class OtherMaterials extends References {
	private String author;
	private int version;
	
	public OtherMaterials(String referenceTitle, String author, int version, String itemType, boolean isAvailable, int daysBorrowed, Date dateBorrowed, Date dateReturned) {
		super(referenceTitle, itemType, 3, isAvailable, daysBorrowed, dateBorrowed, dateReturned);
		this.author = author;
		this.version = version;
	}

}
