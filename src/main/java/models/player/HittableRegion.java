package models.player;

import com.fluentinterface.ReflectionBuilder;
import com.fluentinterface.builder.Builder;

public class HittableRegion {

	private int x;

	public static HittableRegionBuilder create() {
		return ReflectionBuilder.implementationFor(HittableRegionBuilder.class)
				.create();
	}

	public interface HittableRegionBuilder extends Builder<HittableRegion> {
		public HittableRegionBuilder withX(int x);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
