package menuForStudents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
	
	private String nameOfStudent;
	private Integer idOfStudent;
	private String dobOfStudent;
	private String studentEmail;
	List<Subject> listSubjects = new ArrayList<>();

	public void setlistSubjects(List<Subject> listSubjects) {
		this.listSubjects = listSubjects;
	}

	public void setnameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}

	public void setidOfStudent(Integer idOfStudent) {
		this.idOfStudent = idOfStudent;
	}

	public void setdobOfStudent(String dobOfStudent) {
		this.dobOfStudent = dobOfStudent;

	}

	public void setstudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;

	}

	public List<Subject> getlistSubjects() {
		return listSubjects;
	}

	public String getstudentEmail() {
		return studentEmail;
	}

	public String getnameOfStudent() {
		return nameOfStudent;
	}

	public Integer getidOfStudent() {
		return idOfStudent;
	}

	public String getdobOfStudent() {
		return dobOfStudent;
	}

}
