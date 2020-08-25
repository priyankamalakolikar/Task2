package master_assignment.action;

import java.util.Date;

public class TestResultSort implements Comparable<TestResultSort> {
	public Date testdate;
	public int testid;
	public int studentId;
	public int marks;
	public int out_of_marks;
	public String sname;
	
	

	public TestResultSort(Date testdate, int testid, int studentId, int marks, int out_of_marks, String sname) {
		super();
		this.testdate = testdate;
		this.testid = testid;
		this.studentId = studentId;
		this.marks = marks;
		this.out_of_marks = out_of_marks;
		this.sname = sname;
	}



	@Override
	public String toString() {
		return "TestResultSort [testdate=" + testdate + ", testid=" + testid + ", studentId=" + studentId + ", marks="
				+ marks + ", out_of_marks=" + out_of_marks + ", sname=" + sname + "]";
	}



	@Override
	public int compareTo(TestResultSort o) {
		// TODO Auto-generated method stub
		int i=this.marks-o.marks;
		if(i==0)
		{
		return this.sname.compareTo(o.sname);
		}
		return this.marks-o.marks;
	}

}
