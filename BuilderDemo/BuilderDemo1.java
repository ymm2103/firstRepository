package BuilderDemo;

public class BuilderDemo1 {

	public static void main(String[] args) {
	
	 //方法链编程，构建器builder模式 	
     Person p=new Person().setName("tom").setAge(20).setSex("男");
     
     
	}

}


class Person{
	private String name;
	private int age;
	private String sex;
	public String getName() {
		return name;
	}
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	public String getSex() {
		return sex;
	}
	public Person setSex(String sex) {
		this.sex = sex;
		return this;
	}
	
	
}