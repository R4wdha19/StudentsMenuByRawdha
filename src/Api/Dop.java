package Api;

import java.io.Serializable;
import java.util.Date;

public class Dop implements Serializable {
	private Date date;
	private int age;

	// Setters And Getters

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
