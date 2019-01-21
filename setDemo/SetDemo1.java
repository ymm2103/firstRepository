package setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
	Set<String> set=new HashSet<String>();

	//hash：散列，去重
	set.add("lily");
	set.add("david");
	set.add("tom");
	set.add("tom");
	set.add("jim");
	System.out.println(set.size());
	
	
	//迭代,Set集合只能通过迭代器迭代，不能通过for循环,输出是无序的
	Iterator iter=set.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	
	}
}
