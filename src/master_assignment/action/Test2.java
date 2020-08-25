package master_assignment.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import master_assignment.bean.Academy;
import master_assignment.bean.Student;
import master_assignment.bean.Transaction;

public class Test2 {
/*find our students who paid all fees, use LinkedHashMap in order to 
 * find out those first 3 students across courses who paid full fees 
 * ( note student can pay fee in part installment or one time as well)
*/
	public static void main(String[] args) {
		Academy academy=new Academy();
		HashMap<Integer,String> NAmes=new HashMap<Integer,String>();
		//cid =key  and  list of trns
		int Courseid=0;
		Set s2=academy.transactionMap.entrySet();
		Iterator itr1=s2.iterator();
		while(itr1.hasNext())
		{
			Map.Entry m=(Entry) itr1.next();
			Integer cid=(Integer) m.getKey();
			ArrayList<Transaction>trans= (ArrayList<Transaction>) m.getValue();
			for(int i=0;i<trans.size();i++)
			{
				if(trans.get(i).paidfees==10000)
				{
					Courseid=cid;
					
					System.out.println("************");
					
					Set s=academy.studentMap.entrySet();
					Iterator itr2=s.iterator();
					while(itr2.hasNext())
					{
						Map.Entry m1=(Entry) itr2.next();
						Integer cd=(Integer) m1.getKey();//cid
						if(cd==Courseid)
						{
						ArrayList<Student>al=(ArrayList<Student>) m.getValue(); //value

							for(int p=0;p<=2;p++)
							{
								String names="";//al.get(p).setstudent_name("");
								NAmes.put(cd, names); //add student to map
							}
						}
						
				}
			}
		}
		System.out.println(NAmes);
		
			}
			
		}
	}

