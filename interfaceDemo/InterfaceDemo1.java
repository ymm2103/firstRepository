package interfaceDemo;

public class InterfaceDemo1 {

	public static void main(String[] args) {
	
		WomenStar ws=new WomenStar();
		
		Tuhao tuhao=new Tuhao();
		tuhao.marry(ws);
		
		
		KereanBoy kb=new KereanBoy();
		kb.white();
		
	}

}


//�ӿڰ�
interface White{
	public void white();
}

//�ӿڸ�
interface Rich{
	public  void rich();
}


//�ӿ���
interface Beauty{
	public  void beauty();
}



//�̳а׸����ӿ�
interface BFM extends White,Rich,Beauty{
	
}





//�׸�����
class WomenStar implements BFM{
	public void white() {
		System.out.println("Ů���Ǻܰ�");
	}
	
	public void rich() {
		System.out.println("Ů����Ҳ����Ǯ");
	}
	
	
    public void beauty() {
	System.out.println("Ů����Ҳ��Ư��");
    }
  	
}


//������
class Tuhao{
	
	//��鷽��
	public void marry(BFM wfm) {
		wfm.white();
		wfm.rich();
		wfm.beauty();
	}
}



class KereanBoy implements White{
	
	public void white() {
		System.out.println("���������ܰ�");
	}
}



