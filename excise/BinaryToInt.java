package excise;

public class BinaryToInt {

	public static void main(String[] args) {    
		
		//输出整数的二进制表示方式		
		System.out.print("10的二进制形式：");
		outBinaryString(10);
		 
		System.out.print("1的二进制形式：");
		outBinaryString(1);
		
		System.out.print("-1的二进制形式：");
		outBinaryString(-1);
		
		//整数的最小数：Integer.MIN_VALUE
		System.out.print("最小数的二进制形式：");
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
