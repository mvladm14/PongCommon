package models.player;

import java.util.Objects;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class Player {

	private long id;
	private String username;
	private int score;
	private boolean canHitBall;
	private HittableRegion hittableRegion;
	private boolean canPlay;

	public static PlayerBuilder create() {
		return ReflectionBuilder.implementationFor(PlayerBuilder.class)
				.create();
	}

	public interface PlayerBuilder extends Builder<Player> {
		public PlayerBuilder withId(int id);

		public PlayerBuilder withUsername(String username);

		public PlayerBuilder withScore(int score);

		public PlayerBuilder withCanHitBall(boolean canHitBall);

		public PlayerBuilder withHittableRegion(HittableRegion hittableRegion);

		public PlayerBuilder withCanPlay(boolean canPlay);
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

	public boolean canPlay() {
		return canPlay;
	}

	public void setCanPlay(boolean canPlay) {
		this.canPlay = canPlay;
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