package rabbit;

public class DiGui {

	public static void main(String[] args) {

		
		
		System.out.println(f(10));
	}

	
	public static int f(int n) {
		
		if(n==1 || n==2)
			return 1;
		
		else 
			return f(n-1)+f(n-2);
	}
	
	
}
