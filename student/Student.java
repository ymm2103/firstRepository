package student;

public class Student {
	
	
	long id;
	String name;
	int age;
	boolean sex;
	long phone;
	
	Student(long i,String n,int a,boolean s,long p){
		
		id=i;
		name=n;
		age=a;
		sex=s;
		phone=p;
	}
	
	int getAge() {return age;}
	
	boolean getSex() {return sex;}
	
	long getPhone() {return phone;}

	public String ToString() {return name+":"+phone;}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
