package models.sensors;

import java.io.Serializable;

public class LinearAcceleration implements Serializable {
	
	private static final long serialVersionUID = 7203636409653204738L;
	
	private float values;
	private long timestamp;
	
	public LinearAcceleration(float values, long timestamp) {
		this.values = values;
		this.timestamp = timestamp;
	}

	public float getValues() {
		return values;
	}

	public long getTimestamp() {
		return timestamp;
	}

}
