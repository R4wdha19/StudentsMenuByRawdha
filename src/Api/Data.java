package Api;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {
	List<Results> results;
	Info info;

	public List<Results> getResults() {
		return results;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}
}