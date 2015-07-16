package models.player;

public class Pallet {

	private Coordinates coordinates;
	private Dimension dimension;

	private float velocity = 0f;
	private float distance = 0f;
	
	private int errorCounter = 0;

	private long lastTimeStamp;

	public Pallet(Coordinates coordinates, Dimension dimension) {
		this.coordinates = coordinates;
		this.dimension = dimension;
		lastTimeStamp = 0;
	}

	public void updatePosition(float y) {
		float yCoordinates = coordinates.getY();
		yCoordinates += y;
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

	public long getLastTimeStamp() {
		return lastTimeStamp;
	}

	public void setLastTimeStamp(long lastTimeStamp) {
		this.lastTimeStamp = lastTimeStamp;
	}

	@Override
	public String toString() {
		return "[Pallet]: " + coordinates.toString() + " "
				+ dimension.toString();
	}

	public boolean resolveCollisionWithBounds(Screen screen) {
		boolean hitBounds = false;
		if (this.getCoordinates().getY() < 0) {
			this.getCoordinates().setY(0);
			hitBounds = true;
		}

		if (this.getCoordinates().getY() + this.getDimension().getHeight() > screen
				.getHeight()) {
			this.getCoordinates().setY(
					screen.getHeight() - this.getDimension().getHeight());
			hitBounds = true;
		}
		return hitBounds;

	}

	public float getVelocity() {
		return velocity;
	}

	public void setVelocity(float velocity) {
		this.velocity = velocity;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public int getErrorCounter() {
		return errorCounter;
	}

	public void setErrorCounter(int errorCounter) {
		this.errorCounter = errorCounter;
	}
	
	

}
