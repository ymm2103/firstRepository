package excise;

public class ByteChange {

	public static void main(String[] args) {
		
	//��һ���Լ�Byte(-128~127)ת����0-255֮�������	
		byte b=-100;
		int i=b & 0xff;
		System.out.println(i);
		
	}	
}
