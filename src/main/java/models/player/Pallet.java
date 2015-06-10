package models.player;

public class Pallet {
	/* coefficient of restitution */
	private static final float COR = 0.7f;

	private Coordinates coordinates;
	private Dimension dimension;

	public Pallet(Coordinates coordinates, Dimension dimension) {
		this.coordinates = coordinates;
		this.dimension = dimension;
	}

	public void updatePosition(float y, long timestamp) {
		long quotent = 100000000000000l;
		long timeDifference = System.nanoTime() - timestamp;
		long dt = (System.nanoTime() - timestamp) / quotent;
		System.out.println("y = " + y + " ---- dt = " + dt);
		int yCoordinates = coordinates.getY();
		yCoordinates += y / 4;
		coordinates.setY(yCoordinates);
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
}
