import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exam01 {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Java");
		list.add("Servlet/JSP");
		list.add(1,"Oracle");
		list.add("Spring");
		list.add("Struts");
		System.out.println(list);
		List list2 = new ArrayList(list);
		System.out.println(list2);
		Collections.sort(list);
		System.out.println(list);
		for(int x=0; x<list.size();x++) {
			System.out.println(x+":"+list.get(x));
		}
		System.out.println("------------------------");
		int x=0;
		for(String str : list){
			System.out.println(x+":"+str);
			x++;
		}
		Iterator iter = list.iterator();		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		

	}

}
