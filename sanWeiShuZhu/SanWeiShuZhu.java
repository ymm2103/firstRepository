package sanWeiShuZhu;

public class SanWeiShuZhu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//��ά������ʾ1
		int[][][] arr={{{1,3,5},{2,4,7,8},{3,6,8}},{{1,2},{3,6},{8,10}}};
		
		//�����������
		outArr(arr);
		System.out.println();
		
		
		//��ά������ʾ2
		int[][][] arra={{{1,3,5},
			             {2,4,7,8},
			             {3,6,8}},
				         {{1,2},
			             {3,6},
			             {8,10}}};
		
		outArr(arra);

		
		
	}
	
	
	
	//�����ά����
	public static void outArr(int[][][] arr){
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+"\t");
					
				}
				System.out.println();
				
			}
			
			System.out.println();
			
		}
		
	}
	
	

}
