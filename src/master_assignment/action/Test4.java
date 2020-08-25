package master_assignment.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import master_assignment.bean.Academy;
//import master_assignment.bean.TestResult;
//New sample class create as TestResultSort for the output
public class Test4 {
/*show student result for course id and test id sorted 
 * from topper to lowest marks. If student marks are equal sort on their names
*/
	public static void main(String[] args) {
		Academy academy=new Academy();
		HashMap<Integer,ArrayList<Integer>> hm=new HashMap<Integer,ArrayList<Integer>>();
		ArrayList<Integer> tid=new ArrayList<Integer>();

		Set s=academy.test_map.entrySet();
		 Iterator itr=s.iterator();
		 while(itr.hasNext())
		 {
			 Map.Entry m=(Entry) itr.next();
			Integer cid= (Integer) m.getValue();
			  ArrayList<TestResultSort> al=  (ArrayList<TestResultSort>) m.getValue();
			  Collections.sort(al);	
			  for(int i=0;i<al.size();i++)
			  {
				  tid.add(al.get(i).testid);
			  }
			  hm.put(cid, tid);
	    }
		 System.out.println(hm);
	 }
}
