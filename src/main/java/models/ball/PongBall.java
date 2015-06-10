package models.ball;

import java.util.Objects;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class PongBall {

	private long id;
	private BallCoordinates coordinates;
	private int diameter;
	private BallSpeed ballSpeed;

	public static PongBallBuilder create() {
		return ReflectionBuilder.implementationFor(PongBallBuilder.class)
				.create();
	}

	public interface PongBallBuilder extends Builder<PongBall> {

		public PongBallBuilder withId(long id);

		public PongBallBuilder withDiameter(int diameter);

		public PongBallBuilder withCoordinates(BallCoordinates coordinates);

		public PongBallBuilder withBallSpeed(BallSpeed ballSpeed);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BallSpeed getBallSpeed() {
		return ballSpeed;
	}

	public void setBallSpeed(BallSpeed ballSpeed) {
		this.ballSpeed = ballSpeed;
	}

	public BallCoordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(BallCoordinates coordinates) {
		this.coordinates = coordinates;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getDiameter(), getCoordinates());
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof PongBall)
				&& Objects.equals(getCoordinates(),
						((PongBall) obj).getCoordinates())
				&& Objects
						.equals(getDiameter(), ((PongBall) obj).getDiameter());
	}

}
