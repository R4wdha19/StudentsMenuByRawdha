package Api;

import java.io.Serializable;

public class Coordinates implements Serializable {
	private Float latitude;
	private Float longitude;

	// Setters And Getters

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

}
