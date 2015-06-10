package models.phone;

import java.util.Arrays;
import java.util.Objects;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class Accelerometer {

	private float[] values;

	public float[] getValues() {
		return values;
	}

	public void setValues(float[] values) {
		this.values = values;
	}

	public static AccelerometerBuilder create() {
		return ReflectionBuilder.implementationFor(AccelerometerBuilder.class)
				.create();
	}

	public interface AccelerometerBuilder extends Builder<Accelerometer> {
		public AccelerometerBuilder withValues(float[] values);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getValues());
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Accelerometer)
				&& Arrays
						.equals(getValues(), ((Accelerometer) obj).getValues());
	}
}
