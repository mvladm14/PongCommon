package models.phone;

import java.util.Arrays;
import java.util.Objects;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class Gravity {

	private float[] values;

	public float[] getValues() {
		return values;
	}

	public void setValues(float[] values) {
		this.values = values;
	}

	public static GravityBuilder create() {
		return ReflectionBuilder.implementationFor(GravityBuilder.class)
				.create();
	}

	public interface GravityBuilder extends Builder<Gravity> {
		public GravityBuilder withValues(float[] values);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getValues());
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Gravity)
				&& Arrays.equals(getValues(), ((Gravity) obj).getValues());
	}

}
