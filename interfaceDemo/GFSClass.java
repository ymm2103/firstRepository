package interfaceDemo;

public class GFSClass {

	public static void main(String[] args) {
		BoyFriend bf=new BoyFriend();
		Girl girl=new Girl();
		girl.findBoyFriend(bf);
		
	}

}


interface Height{
	public void height();
}


interface Riching{
	public void rich();
}

interface Hansome{
	public void hansome();
}



//ʵ���˸߸�˧��
interface HRH extends Height,Riching,Hansome{
	
	
}



//��������
class BoyFriend implements HRH{
	public void height() {
		System.out.println("�ܸ�");
	}
	
	public void rich() {
		System.out.println("�ܸ�");
	}
	
	
	
	public void hansome() {
		System.out.println("��˧");
	}
}




//Ů����������
class Girl{
	public void findBoyFriend(HRH bf) {
	   bf.height();
	   bf.rich();
	   bf.hansome();
	}
}