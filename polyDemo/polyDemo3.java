package polyDemo;

public class polyDemo3 {

	public static void main(String[] args) {
		//WomanStar s=new WomanStar();
		
		
		//�����ڲ������ֻ����һ������ʱ�ʺ��������ڲ���
		RichMan rm=new RichMan();
		rm.findLover(new WRB() {
			public void white() {
				System.out.println("�ܰ׺ܰס�����");
			}
		});
	}

}



//�׸����ӿ�
interface WRB{
	public void white();
}



//Ů������
/*class WomanStar implements WRB{
	public void white() {
		System.out.println("�ܰ�");
	}
}*/




//������
class RichMan{
	public void findLover(WRB W) {
		W.white();
	}
}



