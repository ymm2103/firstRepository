package caseDemo;

public class CaseMonth {
	
	
	public static void main(String[] args){
		
		

		int a=7;
		int b;
		b=(a-1)/3;
		
		if(a<1 || a>12)
		{
			System.out.println("�Ƿ��·�");
			
		}
		
		else
		{
			
			switch (b)
			{
			
			case 0:
				System.out.println("��һ����");
				break;
			case 1:
				System.out.println("�ڶ�����");
				break;
			case 2:
				System.out.println("��������");
				break;
			default :
			System.out.println("���ļ���");
				
			}
			
		}			
		
	}
	
}
