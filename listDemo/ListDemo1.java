package listDemo;

import java.util.List;


import java.util.ArrayList;
import java.util.Iterator;

class ListDemo1 {
public static void main(String[] args) {
	 List<String> list=new ArrayList<String>(); 
	 
	 //向集合中添加元素
	 list.add("Tom");
	 list.add("Jim");
	 list.add("kimi");
	 
	 //指定位置添加元素
	 list.add(0, "ailis");
	 
	 //一次性添加多个元素
	 list.addAll(list);
	 
	 //删除集合元素
	  list.remove(0);
	  
	  //删除集合最后一个元素
	  list.remove(list.size()-1);
	 
/*	 //删除集合所有元素
	 list.clear();*/
	 
	//输出集合个数
	 System.out.println(list.size());
	 
	 //遍历元素
	 for(int i=0;i<list.size();i++) {
		 System.out.println(list.get(i));
	 }
	 
	 
	 //集合不存在
	 List<String> list2=null;
	 System.out.println(list2);
	 
	 
	 //集合为空
	 List<String> list3=new ArrayList<String>();
		
	 
	 //判断集合的有效性,先判断是否存在，再判断是否为空，list.isEmpty()==list.size()>0
	 if(list2!=null && list2.isEmpty()) {
		 System.out.println(list2.size());
	 }
	 
	 
	 //判断集合中是否包含指定元素
	 System.out.println(list.contains("Jim"));
	 
	 
	 //查看元素在集合中的位置
	 System.out.println(list.indexOf("Tom"));
	 
	 
	 //该元素的最后出现位置
	 System.out.println(list.lastIndexOf("Jim"));
	 
	 
	//通过迭代器访问集合
     Iterator<String>	it=list.iterator();
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
}
}
