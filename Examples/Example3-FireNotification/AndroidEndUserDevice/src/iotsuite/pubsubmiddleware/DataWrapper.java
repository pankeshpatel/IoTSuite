package iotsuite.pubsubmiddleware;

import iotsuite.semanticmodel.Device;

import java.io.Serializable;


public class DataWrapper implements Serializable {
	/**
 * 
 */
	private static final long serialVersionUID = 1L;
	Device device;
	Object object;

	public void setDevice(Device device) {
		this.device = device;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Device getDevice() {
		return device;
	}

	public Object getObject() {
		return object;
	}

}
