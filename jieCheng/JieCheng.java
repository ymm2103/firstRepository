package jieCheng;

public class JieCheng {

	public static void main(String[] args) {
		
	System.out.println("5µÄ½×³ËÊÇ"+f(5));

	}
	
	
	
	
public static int f(int n) {
	
	if(n==1)
	{
		return 1;
	}
	
	else
	{
		return n*f(n-1);
	}
	
}
		


}
