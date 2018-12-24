package numberSum;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,sum=0;
		String s="";
		System.out.println("请输入一个整数：");
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			s=br.readLine();
			
			
		}
		catch(Exception e) {}
		n=Integer.parseInt(s);
		
	    for(int i=1;i<=n;i++)
	    {
	    	
	    	sum+=n;
	    }
	    
	    System.out.println("前n个数的和是："+sum);
	
	}

}
