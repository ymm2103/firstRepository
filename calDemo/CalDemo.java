package calDemo;

public class CalDemo {

	public static void main(String[] args) {
	 int a=+5;
	 int b=-5;
	 System.out.println("a+b="+(a+b));	
	 System.out.println(a+(-b));
	 
	 //˫��
	 System.out.println(true||false);
	 
	 //˫��
	 System.out.println( (a>0)&&(b>0));
	 
	 //��λ��
	 System.out.println(5 & 6);
	 
	 //��λ��
	 System.out.println(5 | 6);
	 
	 //ȡ��
	 System.out.println(!true);
	 
	 //�����ư�λȡ��
	 System.out.println(~5);
	 
	 //�Ƚ������
	 System.out.println(5!=5);
	 
	 //�������
	 System.out.println(!true);
	 
	 //instance of�ж϶����Ƿ���ָ��������
	 Object o="hello";
	 System.out.println(o instanceof Object);   //true
	 System.out.println(o instanceof String);	//true
	 System.out.println(o instanceof Class);	//false
	 
	 //����
	 System.out.println(5 << 2);
	 
	 //�޷������ƣ������0����
	 System.out.println(5 >> 2);

	 //���
	 System.out.println(5 ^ 6);
	 
	 //��λȡ��
	 System.out.println(~5);
	 
	}

}
