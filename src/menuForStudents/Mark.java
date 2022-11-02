package menuForStudents;

import java.io.Serializable;

public class Mark implements MarkI, Serializable {
	private int markOfAssignment1;
	private int markOfAssignment2;
	private int markOfTest1;
	private int markOfTest2;

	@Override
	public int getAssignmentTotalMark() {
		int totalMark = 0;
		totalMark = markOfAssignment1 + markOfAssignment2;
//		System.out.println(" The Total Assignment Marks :" + totalMark);
		return totalMark;
	}

	@Override
	public int getTestTotalMark() {

		int totalTMark = 0;
		totalTMark = markOfTest1 + markOfTest2;
//		System.out.println(" The Total Test Marks :" + totalTMark);
		return totalTMark;
	}

	@Override
	public void getStudentStatus() {
		int studentStatus = getAssignmentTotalMark() + getTestTotalMark();
		System.out.println(" The Total Assignment Marks :" + getAssignmentTotalMark());
		System.out.println(" The Total Test Marks :" + getTestTotalMark());
		
		if(studentStatus>30) {
			System.out.println(" The Student Has passed This Subject" );
			
		}
		else {
			System.out.println(" The Student Has Failed This Subject" );
		}
		
	}
	// Getters and Setters

	public void setmarkOfAssignment1(int markOfAssignment1) {
		this.markOfAssignment1 = markOfAssignment1;
	}

	public int getmarkOfAssignment1() {
		return markOfAssignment1;
	}

	public void setmarkOfAssignment2(int markOfAssignment2) {
		this.markOfAssignment2 = markOfAssignment2;
	}

	public int getmarkOfAssignment2() {
		return markOfAssignment2;
	}

	public void setmarkOfTest1(int markOfTest1) {
		this.markOfTest1 = markOfTest1;
	}

	public int getmarkOfTest1() {
		return markOfTest1;
	}

	public void setmarkOfTest2(int markOfTest2) {
		this.markOfTest2 = markOfTest2;
	}

	public int getmarkOfTest2() {
		return markOfTest2;
	}
}
