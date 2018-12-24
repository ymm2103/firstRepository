package NiXuShuChu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]=new int[10];
		
		for(int i=0;i<10;i++)
		{
			try {
				
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
                a[i]=Integer.parseInt(br.readLine());
			}
			
			catch(Exception e) {}		
		}
		
		for(int i=9;i>=0;i--)
			System.out.println(a[i]);
		
		
	}

}
