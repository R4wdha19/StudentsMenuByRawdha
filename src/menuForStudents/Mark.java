package menuForStudents;

public class Mark implements MarkI {
	private   int markOfAssignment1;
	private   int markOfTest1;
	private   int markOfAssignment2;
	@Override
	public void getMark() {
		int totalMark;
		totalMark=markOfAssignment1+markOfAssignment2 ;
		System.out.println(" The Total Assignment Marks :"+totalMark);
	}
     
   //Getters and Setters
 	
 	public void setmarkOfAssignment1(int markOfAssignment1) {
 		this.markOfAssignment1 = markOfAssignment1;
 	}

 	public int getmarkOfAssignment1(){
	 		return markOfAssignment1;
	 	}
 	public void setmarkOfAssignment2(int markOfAssignment2) {
		this.markOfAssignment2 = markOfAssignment2;
 	}
 	public int getmarkOfAssignment2(){
		return markOfAssignment2;
	}
 	

 	public void setmarkOfTest1(int markOfTest1) {
 		this.markOfTest1 = markOfTest1;
 	}

 	   public int getmarkOfTest1(){
 		return markOfTest1;
 	}
 	   
}
