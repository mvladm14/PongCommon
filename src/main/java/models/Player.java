package models;

import java.util.Objects;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class Player {

	private long id;
	private String username;
	private PhoneCoordinates phoneCoordinates;

	public static PlayerBuilder create() {
		return ReflectionBuilder.implementationFor(PlayerBuilder.class)
				.create();
	}

	public interface PlayerBuilder extends Builder<Player> {
		public PlayerBuilder withUsername(String username);

		public PlayerBuilder withPhoneCoordinates(
				PhoneCoordinates phoneCoordinates);
		
		public PlayerBuilder withId(long id);
	}

	public PhoneCoordinates getPhoneCoordinates() {
		return phoneCoordinates;
	}

	public void setPhoneCoordinates(
			PhoneCoordinates phoneCoordinates) {
		this.phoneCoordinates = phoneCoordinates;
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
		return Objects.hash(getUsername(), getPhoneCoordinates());
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof PhoneCoordinates)
				&& Objects.equals(getUsername(), ((Player) obj).getUsername())
				&& Objects.equals(getPhoneCoordinates(),
						((Player) obj).getPhoneCoordinates());
	}
}