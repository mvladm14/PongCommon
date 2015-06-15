package models.phone;

import java.util.Arrays;
import java.util.Objects;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class LinearAcceleration {

	private float[] values;

	public float[] getValues() {
		return values;
	}

	public void setValues(float[] values) {
		this.values = values;
	}

	public static LinearAccelerationBuilder create() {
		return ReflectionBuilder.implementationFor(
				LinearAccelerationBuilder.class).create();
	}

	public interface LinearAccelerationBuilder extends
			Builder<LinearAcceleration> {
		public LinearAccelerationBuilder withValues(float[] values);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getValues());
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof LinearAcceleration)
				&& Arrays.equals(getValues(),
						((LinearAcceleration) obj).getValues());
	}
}
