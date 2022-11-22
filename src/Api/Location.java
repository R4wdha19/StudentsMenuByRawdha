package Api;

import java.io.Serializable;

public class Location implements Serializable {
	private String city;
	private String state;
	private String country;
	private String postcode;
	private Street street;
	private Coordinates coordinates;
	private Timezone timezone;

	// Setters And Getters

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public Timezone getTimezone() {
		return timezone;
	}

	public void setTimezone(Timezone timezone) {
		this.timezone = timezone;
	}

}
