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
    
    //�쳣��ĸ��࣬�������쳣��̳У�����ں���
    catch(Exception e) {
    	System.out.println("����̫���̫С");
    }
    
	}
	
	
	//������鷽�������쳣����
	public static void outArry(int[] arr) {
		try {
			  for(int i=0;i<arr.length;i++)
			    {
			    	System.out.print(arr[i]+"\t");
			    }
		}
		catch(Exception e) {
			System.out.println("����������");
		}

	}

	
}





//�Զ����쳣
class Person{
	private int age;
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws AgeTooSmallException{
		if(age<0) {
			throw new AgeTooSmallException("����̫С�����Ϸ�");
		}
		
		if(age>200) {
			throw  new AgeTooBigException("����̫�󣬲��Ϸ�");
		}	
		
		this.age=age; 
	}
	
}



class Student extends Person{
	
	//������дʱ�����׳����෽���쳣,���ǲ������׳��µ��쳣���ͣ��������쳣���ͼ̳и��෽���е��쳣���ͣ�
	public void setAge(int age) throws/* InvalidAgeException,*/AgeTooSmallException{
		if(age>15 || age<6) {
			throw new AgeTooSmallException("���䳬��Сѧ����Χ");
		}
		
		super.setAge(age);
		System.out.println("��������over");
	}
}



//�Զ����쳣�࣬�̳и����е��쳣��ʱ���Ա�����ķ����׳�
class InvalidAgeException/* extends Exception*/{
	private String info;
	public InvalidAgeException(String info) {
		this.info=info;
	}
	
	public void outInfo() {
		System.out.println(info);
	}
	
}



//�Զ����쳣��
class AgeTooSmallException extends Exception{ 
public AgeTooSmallException() {}

public AgeTooSmallException(String str) {
	super(str);
    }
}


//�Զ����쳣��
class AgeTooBigException extends RuntimeException{      //�̳�RuntimeException����ʱ�쳣�࣬���Բ�������
	public AgeTooBigException() {}

	public AgeTooBigException(String str) {
		super(str);
	    }
}



