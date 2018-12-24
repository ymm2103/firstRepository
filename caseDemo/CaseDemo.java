package caseDemo;

public class CaseDemo {

	public static void main(String[] args) {
		int a=5;
		if(a<1)
		{
			
			System.out.println("ture");
		}
		
		else
		{
			
			System.out.println("false");
		}

		
		if(a>0)
		{
			System.out.println("a>0");
		}
		
		else if(a<0)
		{
		System.out.println("a<0");
	 	}
		
		else
		{
			
			System.out.println("a=0");
		}
		
		
		//switchÓï¾ä
		int m=9;
		String str="";

		
		switch(m)
		{
		case 8:
			str="big";
		    break;
			
		case 9:
			str="middle";
			break;
		
		case 10:
			str="small";
			break;
		
		
		}
			
		System.out.println(str);
		
		
	}
	
	
}

	
	
	
