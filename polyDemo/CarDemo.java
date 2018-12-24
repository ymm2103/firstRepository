package polyDemo;

public class CarDemo {

	public static void main(String[] args) {
		
	
		//向上转型
		Car car=new Benz();
		System.out.println(car.getColor());     //成员变量只看引用变量所属的类；
		                                        //成员方法要看对象所属的类中是否有所调用的成员方法；
		//调用重写的Benz类中方法
		car.setColor("white");              
		System.out.println(car.getColor());  

	}
	

}



class Car{
	private String color="无色";
	
	public void setColor(String color) {
		this.color=color;
	}

	public String getColor() {
		return color;
	}
}


class Benz extends Car{
	private String color="黑色";
	
	public void setColor(String color) {
    this.color=color;
	}
	
    public String getColor() {
	return color;
   }
    
    
}
