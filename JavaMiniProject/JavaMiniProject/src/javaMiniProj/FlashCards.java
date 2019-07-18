package javaMiniProj;

import java.util.Date;

public class FlashCards extends References {
	private String fCardsPublisher;
	
	public FlashCards(String referenceTitle, String fCardsPublisher, String itemType, boolean isAvailable, int daysBorrowed, Date dateBorrowed, Date dateReturned) {
		super(referenceTitle, itemType, 2, isAvailable, daysBorrowed, dateBorrowed, dateReturned);
		this.fCardsPublisher = fCardsPublisher;
	}
}
