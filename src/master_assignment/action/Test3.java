package master_assignment.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import master_assignment.bean.Academy;
import master_assignment.bean.Student;
import master_assignment.bean.TestResult;

public class Test3 {
/*
 * show poor performing students (marks <40%) across all 
 * tests for a course id.
*/
	public static void main(String[] args) {
		Academy academy=new Academy();
		int sum=0;
		int avg=0;
		int count=0;
		int studid = 0;
		HashMap<Integer,ArrayList<Integer>> hm=new HashMap<Integer,ArrayList<Integer>>();
		ArrayList<Integer> stud=new ArrayList<Integer>();
		Set s=academy.test_map.entrySet();
	 Iterator itr=s.iterator();
	 while(itr.hasNext())
	 {
		 Map.Entry m=(Entry) itr.next();
		Integer cid= (Integer) m.getValue();
		  ArrayList<TestResult> al=  (ArrayList<TestResult>) m.getValue();
		  for(int i=0;i<al.size();i++)
		  {
			 sum=sum+al.get(i).marks;
			 count++;
			 studid=al.get(i).studentId;
		  }
		  avg=sum/count;
		  if(avg<40)
		  {
			stud.add(studid)  ;
			hm.put(cid,stud );
		  }

	 }
	 System.out.println(hm);

	}
}
