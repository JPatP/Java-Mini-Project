package javaMiniProj;

import java.util.Date;

public class VideoCD extends References {
	private int videoRunTime;
	private String videoPublisher;
	
	public VideoCD(String referenceTitle, int videoRunTime, String videoPublisher, String itemType, boolean isAvailable, int daysBorrowed, Date dateBorrowed,Date dateReturned) {
		super(referenceTitle, itemType, 2, isAvailable, daysBorrowed, dateBorrowed, dateReturned);
		this.videoRunTime = videoRunTime;
		this.videoPublisher = videoPublisher;
	}
}