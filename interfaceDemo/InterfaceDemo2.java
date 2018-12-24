package interfaceDemo;

public class InterfaceDemo2 {

	public static void main(String[] args) {
		
		Mp3 mp3=new Mp3();
		Fun fun=new Fun();
		Camera camera=new Camera();
		Computer computer=new Computer();
		
		computer.insert(mp3);
		computer.insert(fun);
		computer.insert(camera);
		
	}

}


interface USB{
	public void play();
	
}


class Mp3 implements USB{
	public void play() {
		System.out.println("mpe usb");
	}	
}



class Fun implements USB{
	public void play() {
		System.out.println("fun usb");
	}
	
}



class Camera implements USB{
	public void play() {
		System.out.println("camera usb");
	}
}


class Computer {
	public void insert(USB usb) {
		usb.play();
	}
}








