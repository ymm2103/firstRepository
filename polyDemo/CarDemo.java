package polyDemo;

public class CarDemo {

	public static void main(String[] args) {
		
	
		//����ת��
		Car car=new Benz();
		System.out.println(car.getColor());     //��Ա����ֻ�����ñ����������ࣻ
		                                        //��Ա����Ҫ�����������������Ƿ��������õĳ�Ա������
		//������д��Benz���з���
		car.setColor("white");              
		System.out.println(car.getColor());  

	}
	

}



class Car{
	private String color="��ɫ";
	
	public void setColor(String color) {
		this.color=color;
	}

	public String getColor() {
		return color;
	}
}


class Benz extends Car{
	private String color="��ɫ";
	
	public void setColor(String color) {
    this.color=color;
	}
	
    public String getColor() {
	return color;
   }
    
    
}
