package polyDemo;

public class polyDemo3 {

	public static void main(String[] args) {
		//WomanStar s=new WomanStar();
		
		
		//匿名内部类对象，只创建一个对象时适合用匿名内部类
		RichMan rm=new RichMan();
		rm.findLover(new WRB() {
			public void white() {
				System.out.println("很白很白。。。");
			}
		});
	}

}



//白富美接口
interface WRB{
	public void white();
}



//女明星类
/*class WomanStar implements WRB{
	public void white() {
		System.out.println("很白");
	}
}*/




//土豪类
class RichMan{
	public void findLover(WRB W) {
		W.white();
	}
}



