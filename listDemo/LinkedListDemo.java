package listDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("Tom");
		list.add("Alice");
		list.add("bob");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
   
	}

}
