package Api;

import java.io.Serializable;

public class Timezone implements Serializable {
	private String offset;
	private String description;

	// Setters And Getters

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
