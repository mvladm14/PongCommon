package models.player;

public class Pallet {

	private Coordinates coordinates;
	private Dimension dimension;
	private static final float MAX_DEGREE = 90f;

	public Pallet(Coordinates coordinates, Dimension dimension) {
		this.coordinates = coordinates;
		this.dimension = dimension;
	}

	public void updatePosition(float y) {
		float yCoordinates = coordinates.getY();
		yCoordinates += y;
		coordinates.setY(yCoordinates);
	}

	public void updatePosition(float[] orientation) {
		float xOrientation = orientation[0] > 0 ? -1f : 1f;
		float y = this.getCoordinates().getY()
				+ ((MAX_DEGREE - Math.abs(orientation[1])) * xOrientation)
				/ 33f;
		this.getCoordinates().setY(y);

	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	@Override
	public String toString() {
		return "[Pallet]: " + coordinates.toString() + " "
				+ dimension.toString();
	}

	public void resolveCollisionWithBounds(Screen screen) {
		if (this.getCoordinates().getY() < 0) {
			this.getCoordinates().setY(0);
		}

		if (this.getCoordinates().getY() + this.getDimension().getHeight() > screen
				.getHeight()) {
			this.getCoordinates().setY(
					screen.getHeight() - this.getDimension().getHeight());
		}

	}
}
