package framework;

public abstract interface IBadgeReader {

	// public abstract BadgeStruct getbadgeDetected();

	public abstract void getbadgeDetected(ListenerbadgeDetected handler);

	// public abstract BadgeStruct getbadgeDisappeared();

	public abstract void getbadgeDisappeared(ListenerbadgeDisappeared handler);

	public abstract boolean isEventDriven();

}