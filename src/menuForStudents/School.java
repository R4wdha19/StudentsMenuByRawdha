package menuForStudents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class School implements Serializable {

	private String schoolName;
	private Integer schoolRegistrtaionNumber;
	List<Student> listStudents = new ArrayList<>();

	// Create Getters and Setters

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void setSchoolRegisterationNumber(Integer schoolRegistrtaionNumber) {
		this.schoolRegistrtaionNumber = schoolRegistrtaionNumber;
	}

	  public void setListStudents (List<Student> listStudents) {
		  this.listStudents= listStudents; 
		  }
	 
	public String getschoolName() {
		return schoolName;
	}

	  public List<Student> getListStudents(){
		  return listStudents;
		  }
	 
	public Integer getschoolRegistrtaionNumber() {
		return schoolRegistrtaionNumber;
	}
}
