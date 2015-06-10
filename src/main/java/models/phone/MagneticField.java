package models.phone;

import java.util.Arrays;
import java.util.Objects;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class MagneticField {

	private float[] values;

	public float[] getValues() {
		return values;
	}

	public void setValues(float[] values) {
		this.values = values;
	}

	public static MagneticFieldBuilder create() {
		return ReflectionBuilder.implementationFor(MagneticFieldBuilder.class)
				.create();
	}

	public interface MagneticFieldBuilder extends Builder<MagneticField> {
		public MagneticFieldBuilder withValues(float[] values);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getValues());
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof MagneticField)
				&& Arrays
						.equals(getValues(), ((MagneticField) obj).getValues());
	}

}
