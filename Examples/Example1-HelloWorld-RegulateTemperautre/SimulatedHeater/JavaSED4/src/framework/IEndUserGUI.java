package framework;

public abstract interface IEndUserGUI {

	public abstract void OffGUI(ListenerEndUserGUI handler);

	public abstract void SetTempGUI(ListenerEndUserGUI handler);

	public abstract void profileGUI(ListenerEndUserGUI handler);

}