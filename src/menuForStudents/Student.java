package menuForStudents;

import java.util.ArrayList;
import java.util.List;

public class Student {
	/*
	 * private int englishM; private int scienceM; String studentN; String
	 * studentAge; private int mathM;
	 * 
	 * void setMark(int m){ mathM=m; } int getMark(){ return mathM; }
	 * 
	 * void setMarke(int n){ englishM=n; } int getMarke(){ return englishM; } void
	 * setMarks(int r){ scienceM=r; } int getMarks(){ return scienceM; }
	 */

	private String nameOfStudent;
	private Integer idOfStudent;
	private String dobOfStudent;
	private String studentEmail;
	//private double currency;
	List<Subject> listSubjects = new ArrayList<>();
//	 List<String> listOfEmails= new ArrayList<>();
//	private	Subject subject;
	// Getters and Setters

//	 public void setlistOfEmails (String listOfEmails) { 
//		 this.listOfEmails =  listOfEmails; }

//	public void setcurrency(double currency) {
//		this.currency = currency;
//	}
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

//	public void setsubject (Subject subject) {
//		this.subject = subject;
//		
//	}

//	
	public List<Subject> getlistSubjects() {
		return listSubjects;
	}

//	  
//	  public List<String> getlistOfEmails(){
//		  return listOfEmails; }
////	
	
//	public double getcurrency() {
//		return currency;
//	}
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

//	   public Subject getsubject() {
//		   return subject;
//			
//		}

	// Constructors
}
