package erWeiShuZhu;

class ErWeiShuZhu {

public static void main(String[] args) {
	
	//�������鷽ʽ1
	int no=1;
	int[][] arr=new int[4][3];
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{		
			arr[i][j]=no;
			no++;
			
		}
	}
	

	//���������ά����
	outArr(arr);
	System.out.println();

	
	
	//�������鷽ʽ2
	int[][] array= {{1,3,89},{-14,23,34},{2,2,2,4}};
	
	outArr(array);
	System.out.println();
	
	
	
	
	//�������鷽ʽ3
	int[][] arra=new int[3][];
	arra[0]=new int[]{1,3,5,7};
	arra[1]=new int[]{4,6};
	arra[2]=new int[]{8,9,0};
	
	outArr(arra);
	
}	


//�������
public static void outArr(int[][] array) {
	for(int i=0;i<array.length;i++)
	{
		
		for(int j=0;j<array[i].length;j++)
		{
			System.out.print(array[i][j]+"\t");
		}
		
		System.out.println();
	}
	
	
}





}
