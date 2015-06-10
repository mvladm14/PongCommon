package models.phone;

import java.util.Objects;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class PhoneSensors {

	private Accelerometer accelerometer;
	private MagneticField magneticField;
	private long sensorTimeStamp;

	public static PhoneSensorsBuilder create() {
		return ReflectionBuilder.implementationFor(PhoneSensorsBuilder.class)
				.create();
	}

	public interface PhoneSensorsBuilder extends Builder<PhoneSensors> {
		public PhoneSensorsBuilder withAccelerometer(Accelerometer accelerometer);

		public PhoneSensorsBuilder withMagneticField(MagneticField magneticField);

		public PhoneSensorsBuilder withSensorTimeStamp(long sensorTimeStamp);
	}

	public long getSensorTimeStamp() {
		return sensorTimeStamp;
	}

	public void setSensorTimeStamp(long sensorTimeStamp) {
		this.sensorTimeStamp = sensorTimeStamp;
	}

	public Accelerometer getAccelerometer() {
		return accelerometer;
	}

	public void setAccelerometer(Accelerometer accelerometer) {
		this.accelerometer = accelerometer;
	}

	public MagneticField getMagneticField() {
		return magneticField;
	}

	public void setMagneticField(MagneticField magneticField) {
		this.magneticField = magneticField;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getSensorTimeStamp(), getAccelerometer(),
				getMagneticField());
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof PhoneSensors)
				&& Objects.equals(getSensorTimeStamp(),
						((PhoneSensors) obj).getSensorTimeStamp())
				&& Objects.equals(getAccelerometer(),
						((PhoneSensors) obj).getAccelerometer())
				&& Objects.equals(getMagneticField(),
						((PhoneSensors) obj).getMagneticField());
	}
}