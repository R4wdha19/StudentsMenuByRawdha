package Api;

import java.io.Serializable;

public class Id implements Serializable {
	private String name;
	private int value;

	// Setters And Getters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
