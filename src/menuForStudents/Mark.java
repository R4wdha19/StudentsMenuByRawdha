package menuForStudents;

import java.io.Serializable;

public class Mark implements MarkI {
	private   int markOfAssignment1;
	private   int markOfTest1;
	@Override
	public void getMark() {
		System.out.println("Get the Total Marks ");
	}
     
   //Getters and Setters
 	
 	public void setmarkOfAssignment1(int markOfAssignment1) {
 		this.markOfAssignment1 = markOfAssignment1;
 	}

 	public int getmarkOfAssignment1(){
	 		return markOfAssignment1;
	 	}

 	public void setmarkOfTest1(int markOfTest1) {
 		this.markOfTest1 = markOfTest1;
 	}

 	   public int getmarkOfTest1(){
 		return markOfTest1;
 	}
 	   
}
