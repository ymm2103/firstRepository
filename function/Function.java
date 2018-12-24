package function;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		int c=add(a,b);
		
System.out.println(c);




	int d=10,e=20,f=5;
	System.out.println(MaxThree(d,e,f));
		
	}
	
	
	
public static int  add(int a,int b) {
	
	return (a+b);
}


public static int MaxThree(int d,int e,int f){
	
	int g;
	
     g=(d>e)?d:e;
     
     return (g>f)?g:f;
	
}



}
