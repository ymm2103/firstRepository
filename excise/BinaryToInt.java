package excise;

public class BinaryToInt {

	public static void main(String[] args) {    
		
		//��������Ķ����Ʊ�ʾ��ʽ		
		System.out.print("10�Ķ�������ʽ��");
		outBinaryString(10);
		 
		System.out.print("1�Ķ�������ʽ��");
		outBinaryString(1);
		
		System.out.print("-1�Ķ�������ʽ��");
		outBinaryString(-1);
		
		//��������С����Integer.MIN_VALUE
		System.out.print("��С���Ķ�������ʽ��");
		outBinaryString(Integer.MIN_VALUE);            
		
	}
	
	public static void outBinaryString(int n)
	{
		for(int i=31;i>=0;i--)
		{
			System.out.print((n>>i)&0x1);
	
		}
		
		System.out.println();
	}
		
}
