package adapterDemo;

public class AdapterCardDemo {

	public static void main(String[] args) {
	VideoCard v=new VideoCard();
	SoundCard s=new SoundCard();
	VoiceCard vo=new VoiceCard();
	PC p=new PC();
	p.solt(v);
    p.solt(s);
    p.solt(vo);
		
	}

}



//�����ӿ�
interface PCI{
	public void play();
}


//������
class VideoCard implements PCI{
	public void play() {
		System.out.println("�Կ�����");
	}
}



class SoundCard implements PCI{
	public void play() {
		System.out.println("��������");
	}
}



class VoiceCard implements PCI{
	public void play() {
		System.out.println("�������쿨");
	}
}



//���������,�в��
class PC{
	public void solt(PCI n) {
	  n.play();
	}
}





