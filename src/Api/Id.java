package Api;

import java.io.Serializable;

public class Id implements Serializable {
	private String name;
	private String value;

	// Setters And Getters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
