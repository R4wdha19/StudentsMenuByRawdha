package menuForStudents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Subject implements Serializable {
	
	private String nameOfSubject;
	private Integer idOfSubject;
	List<Mark> markList = new ArrayList<>();
	
	//Getters and Setters

	  public void setmarkList (List<Mark> markList) { 
		  this.markList = markList; 
		  }
	
	public void setnameOfSubject(String nameOfSubject) {
		this.nameOfSubject = nameOfSubject;
	}
	
	public void setidOfSubject(Integer idOfSubject) {
		this.idOfSubject = idOfSubject;
	}
	
	   public String getnameOfSubject(){
		return nameOfSubject;
	}
	   public Integer getidOfSubject(){
		return idOfSubject;
	}

	  public List<Mark> getmarkList(){
		  return markList; 
		  }
	 
}
