package master_assignment.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import master_assignment.bean.Academy;
import master_assignment.bean.Student;

public class TestAcademy {
	public static void main(String[] args) {
		Academy a = new Academy();
		ArrayList<Integer>al= new ArrayList();
		/*
		 * show most favoured course based on number of students enrolled. (Course with maximum students)

		 */
		int count=0;
		int max=0;
		int cid=0;
		Set s = a.studentMap.entrySet();
		    Iterator itr = s.iterator();
		    while (itr.hasNext()) {
			Map.Entry e = (Entry) itr.next();
			Integer i=(Integer) e.getKey();//Course id key
			ArrayList<Student>stud=(ArrayList<Student>) e.getValue(); //value
			for(int j=0;j<stud.size();j++)
			{
				count++;
				
			}
			if(count>max)
			{
				max=count;
				cid=i;
			}
		}
		    System.out.println("Cid"+cid);
	}
}
