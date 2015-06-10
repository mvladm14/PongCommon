package models.ball;

import java.util.Objects;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class BallCoordinates {

	private int x;
	private int y;

	public static CoordinatesBuilder create() {
		return ReflectionBuilder.implementationFor(CoordinatesBuilder.class)
				.create();
	}

	public interface CoordinatesBuilder extends Builder<BallCoordinates> {

		public CoordinatesBuilder withX(int x);

		public CoordinatesBuilder withY(int y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getX(), getY());
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof BallCoordinates)
				&& Objects.equals(getX(), ((BallCoordinates) obj).getX())
				&& Objects.equals(getY(), ((BallCoordinates) obj).getY());
	}
	
	@Override
	public String toString() {
		return "x: " + x + " y: " + y;
	}
}