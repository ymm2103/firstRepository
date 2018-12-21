package exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {
    int[] arr=null;    //{1,2,3,4,5}; 
	 outArry(arr);
	 
	 
	Person p=new Person();
    try {
		p.setAge(-1);
	} 
    
    catch (AgeTooSmallException | AgeTooBigException e) {	
		System.out.println(e.getMessage());
	} 
    
    //异常类的父类，被其他异常类继承，须放在后面
    catch(Exception e) {
    	System.out.println("年龄太大或太小");
    }
    
	}
	
	
	//输出数组方法（有异常处理）
	public static void outArry(int[] arr) {
		try {
			  for(int i=0;i<arr.length;i++)
			    {
			    	System.out.print(arr[i]+"\t");
			    }
		}
		catch(Exception e) {
			System.out.println("数组有问题");
		}

	}

	
}





//自定义异常
class Person{
	private int age;
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws AgeTooSmallException{
		if(age<0) {
			throw new AgeTooSmallException("年龄太小，不合法");
		}
		
		if(age>200) {
			throw  new AgeTooBigException("年龄太大，不合法");
		}	
		
		this.age=age; 
	}
	
}



class Student extends Person{
	
	//方法重写时必须抛出父类方法异常,但是不允许抛出新的异常类型（除非新异常类型继承父类方法中的异常类型）
	public void setAge(int age) throws/* InvalidAgeException,*/AgeTooSmallException{
		if(age>15 || age<6) {
			throw new AgeTooSmallException("年龄超出小学生范围");
		}
		
		super.setAge(age);
		System.out.println("设置年龄over");
	}
}



//自定义异常类，继承父类中的异常类时可以被子类的方法抛出
class InvalidAgeException/* extends Exception*/{
	private String info;
	public InvalidAgeException(String info) {
		this.info=info;
	}
	
	public void outInfo() {
		System.out.println(info);
	}
	
}



//自定义异常类
class AgeTooSmallException extends Exception{ 
public AgeTooSmallException() {}

public AgeTooSmallException(String str) {
	super(str);
    }
}


//自定义异常类
class AgeTooBigException extends RuntimeException{      //继承RuntimeException运行时异常类，可以不用声明
	public AgeTooBigException() {}

	public AgeTooBigException(String str) {
		super(str);
	    }
}



