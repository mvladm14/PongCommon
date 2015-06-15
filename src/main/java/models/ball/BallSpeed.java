package models.ball;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class BallSpeed {

	private int deltaX = -1;
	private int deltaY = 1;

	public static BallSpeedBuilder create() {
		return ReflectionBuilder.implementationFor(BallSpeedBuilder.class)
				.create();
	}

	public interface BallSpeedBuilder extends Builder<BallSpeed> {
		public BallSpeedBuilder withDeltaX(int deltaX);

		public BallSpeedBuilder withDeltaY(int deltaY);
	}

	public int getDeltaX() {
		return deltaX;
	}

	public void setDeltaX(int deltaX) {
		this.deltaX = deltaX;
	}

	public int getDeltaY() {
		return deltaY;
	}

	public void setDeltaY(int deltaY) {
		this.deltaY = deltaY;
	}

}
