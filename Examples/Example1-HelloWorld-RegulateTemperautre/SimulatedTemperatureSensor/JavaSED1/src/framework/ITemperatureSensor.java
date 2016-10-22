package framework;

public abstract interface ITemperatureSensor {

	// public abstract TempStruct gettempMeasurement();

	public abstract void gettempMeasurement(ListenertempMeasurement handler);

	public abstract boolean isEventDriven();

}