package Api;

import java.io.Serializable;

public class Info implements Serializable {
	private int results;
	private String version;
	private int page;
	private String seed;

	// Setters And Getters

	public float getResults() {
		return results;
	}

	public void setResults(int results) {
		this.results = results;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public float getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getSeed() {
		return seed;
	}

	public void setSeed(String seed) {
		this.seed = seed;
	}

}
