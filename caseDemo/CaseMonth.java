package caseDemo;

public class CaseMonth {
	
	
	public static void main(String[] args){
		
		

		int a=7;
		int b;
		b=(a-1)/3;
		
		if(a<1 || a>12)
		{
			System.out.println("非法月份");
			
		}
		
		else
		{
			
			switch (b)
			{
			
			case 0:
				System.out.println("第一季度");
				break;
			case 1:
				System.out.println("第二季度");
				break;
			case 2:
				System.out.println("第三季度");
				break;
			default :
			System.out.println("第四季度");
				
			}
			
		}			
		
	}
	
}
