package menuForStudents;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private String nameOfSubject;
	private Integer idOfSubject;
//	private Mark mark;
	
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
//	public void setmark(Mark mark) {
//		this.mark = mark;
//	}
	
	
	   public String getnameOfSubject(){
		return nameOfSubject;
	}
	   public Integer getidOfSubject(){
		return idOfSubject;
	}
//	   public Mark getmark(){
//			return mark;
//		}
	
	  public List<Mark> getmarkList(){
		  return markList; 
		  }
	 
}
