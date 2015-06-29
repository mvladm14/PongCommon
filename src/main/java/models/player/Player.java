package models.player;

import java.util.Objects;

public class Player {

	private long id;
	private String username;
	private int score;
	private boolean canHitBall;
	private HittableRegion hittableRegion;

	public Player(long id, String username, int score, boolean canHitBall,
			HittableRegion hittableRegion) {
		this.id = id;
		this.username = username;
		this.score = score;
		this.canHitBall = canHitBall;
		this.hittableRegion = hittableRegion;
	}

	public HittableRegion getHittableRegion() {
		return hittableRegion;
	}

	public void setHittableRegion(HittableRegion hittableRegion) {
		this.hittableRegion = hittableRegion;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean canHitBall() {
		return canHitBall;
	}

	public void setCanHitBall(boolean canHitBall) {
		this.canHitBall = canHitBall;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getUsername(), getScore());
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Player)
				&& Objects.equals(getUsername(), ((Player) obj).getUsername())
				&& Objects.equals(getScore(), ((Player) obj).getScore());
	}
}