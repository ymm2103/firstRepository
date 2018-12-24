package polyDemo;

public class PolyDemo2 {

	public static void main(String[] args) {
			
	
 Jing8 jing8=new Jing8();
 jing8.cry();
 
 jing8.name="jing8";
System.out.println(jing8.name); 
jing8.cry();


//jing8向上转型为dog
Dogs dog=jing8;
System.out.println(dog.name);       //name属性不会被覆盖，为dog的属性
dog.cry();                          //cry()方法会被覆盖，为jing8的方法
 
	}

}



abstract class Animals{
	public abstract void cry(); 
}


class Dogs extends Animals{
	
	public String name="大黄dog";

	public void cry() {
	System.out.println("汪汪汪.....");	
	}
}



class Jing8 extends Dogs{
	
	public String name="jing8dog";
	
	public void cry() {
		System.out.println("jing8.......");
	}
}

