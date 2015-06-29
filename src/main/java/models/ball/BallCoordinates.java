package models.ball;

import java.util.Objects;

public class BallCoordinates {

	private int x;
	private int y;
	
	public BallCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
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