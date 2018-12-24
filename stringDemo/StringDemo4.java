package stringDemo;

public class StringDemo4 {

	public static void main(String[] args) {
		int color=0;
	for(int i=0;i<0xffff;i++) {
		System.out.print(Integer.toHexString(i)+":"+(char)i+" ");
		color++;
		if(color==20) {
       color=0;
       System.out.println();
     	}

	}

 }
}
	
