package models.player;

import java.util.Objects;

import models.phone.PhoneSensors;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class Player {

	private long id;
	private String username;
	private PhoneSensors phoneSensors;
	private int score;
	private boolean canHitBall;
	private HittableRegion hittableRegion;

	public static PlayerBuilder create() {
		return ReflectionBuilder.implementationFor(PlayerBuilder.class)
				.create();
	}

	public interface PlayerBuilder extends Builder<Player> {
		public PlayerBuilder withUsername(String username);

		public PlayerBuilder withPhoneSensors(
				PhoneSensors phoneSensors);

		public PlayerBuilder withId(long id);

		public PlayerBuilder withScore(int score);

		public PlayerBuilder withCanHitBall(boolean canHitBall);
		
		public PlayerBuilder withHittableRegion(HittableRegion hittableRegion);
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

	public PhoneSensors getPhoneSensors() {
		return phoneSensors;
	}

	public void setPhoneSensors(PhoneSensors phoneSensors) {
		this.phoneSensors = phoneSensors;
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
		return Objects.hash(getUsername(), getPhoneSensors(), getScore());
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof PhoneSensors)
				&& Objects.equals(getUsername(), ((Player) obj).getUsername())
				&& Objects.equals(getPhoneSensors(),
						((Player) obj).getPhoneSensors())
				&& Objects.equals(getScore(), ((Player) obj).getScore());
	}
}