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



//创建接口
interface PCI{
	public void play();
}


//创建类
class VideoCard implements PCI{
	public void play() {
		System.out.println("显卡插入");
	}
}



class SoundCard implements PCI{
	public void play() {
		System.out.println("插入声卡");
	}
}



class VoiceCard implements PCI{
	public void play() {
		System.out.println("插入音响卡");
	}
}



//定义电脑类,有插槽
class PC{
	public void solt(PCI n) {
	  n.play();
	}
}





