package deviceImpl;

import java.util.Random;

import framework.*;

public class JavaSETemperatureSensor implements ITemperatureSensor {

	// private boolean continueFlag = false;

	/*
	 * @Override public TempStruct gettempMeasurement(){ return null; }
	 */

	@Override
	public void gettempMeasurement(ListenertempMeasurement handler) {

		// continueFlag = true;
		while (true) {
			try {
				handler.onNewtempMeasurement(this.gettempMeasurement());
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// continueFlag = false;
			}

		}

	}

	@Override
	public boolean isEventDriven() {
		return true;
	}

	/* Random number generator */

	private static double showRandomInteger(int aStart, int aEnd, Random aRandom) {
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		double range = (double) aEnd - (double) aStart + 1;
		double fraction = (long) (range * aRandom.nextDouble());
		double randomNumber = (double) (fraction + aStart);
		return randomNumber;
	}

	private TempStruct gettempMeasurement() {

		int START = 20;
		int END = 40;
		Random random = new Random();
		double tempValue = showRandomInteger(START, END, random);
		return new TempStruct(tempValue, "C");
	}

}