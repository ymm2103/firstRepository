package listDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
     List<Person> list=new ArrayList<Person>();
      Person p;
     for(int i=1;i<=100;i++){
    	 p=new Person();
    	 p.setName("Tom"+i);
    	 p.setAge(i);
    	 list.add(p);
     }
     
     
     //迭代器打印集合
     Iterator<Person> it=list.iterator();
     while(it.hasNext()) {
    	 
    	  /*it.next()会自动跳到下一对象，不能打印出年龄相对应的年龄
          System.out.println(it.next().getName()+"\t"+it.next().getAge()); */     
  	 
     	 Person p0=it.next();
    	 System.out.println(p0.getName()+"\t"+p0.getAge());
     }
     
     System.out.println("Tom99?"+list.contains(new Person("Tom99",99)));
     
     
     System.out.println("................");
    
     
     
    //StringDemo
     String s1="abc";
     String s2="abc";
     System.out.println(s1==s2);                   //==判断的内存地址是否相同，ture
     
     String str1=new String("abc");
     String str2=new String("abc");
     System.out.println(str1==str2);               //两个对象的内存地址不同，false
     System.out.println(str1.equals(str2));       //equals在Object类中判断的是内存地址是否相同，但在String类中重写了方法，判断内容是否相同，true
     
     Person p1=new Person(null,1);
     Person p2=new Person(null,1);
     System.out.println(p1.equals(p2));              //equals判断的内存地址是否相同,调用Object类中的equals方法，判断地址是否相同，false
                                                     //重写了equals方法，返回true;
     
     
     
     

	}

}




class Person{
	private String name;
	private int age;

	public Person() {}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public boolean equals(Object obj) {
		//1 obj对象为空
		if (obj==null) {
			return false;
		}
		
		//2 是否为同一对象
		if(this==obj) {
			return true;
		}
		
		//3判断obj是否为Person类实例
		if(obj instanceof Person) {
			//强制转型
			Person p0=(Person)obj;
			boolean nameEqul=false;
			
			//判断名字是否为空
			if(this.name==null) {
				if(p0.name==null) {
					return true;
				}
				else {
					nameEqul=false;
				}	
			}
			else {
				nameEqul=name.equals(p0.name);
			}
			
			
			//判断年龄是否相同
			boolean ageEqul=(this.age==p0.age);
             return nameEqul&&ageEqul;
            }	
		
		
		//4 不相同
		return false;
		
	}
		

}
