package models;

import java.util.Objects;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class PhoneCoordinates {

	private double x;
	private double y;
	private double z;
	
	public static GryoscopeCoordinatesBuilder create() {
		return ReflectionBuilder.implementationFor(GryoscopeCoordinatesBuilder.class).create();
	}

	public interface GryoscopeCoordinatesBuilder extends Builder<PhoneCoordinates> {
		public GryoscopeCoordinatesBuilder withX(double x);
		public GryoscopeCoordinatesBuilder withY(double y);
		public GryoscopeCoordinatesBuilder withZ(double z);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getX(), getY(), getZ());
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof PhoneCoordinates)
				&& Objects.equals(getX(), ((PhoneCoordinates) obj).getX())
				&& Objects.equals(getY(), ((PhoneCoordinates) obj).getY())
				&& Objects.equals(getZ(), ((PhoneCoordinates) obj).getZ());
	}
	
	@Override
	public String toString() {
		return "x: " + x + " y: " + y + " z: " + z;
	}
	
	
}