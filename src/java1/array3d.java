package java1;

public class array3d {

	public void function()
	{
		int [][][] array=new int [2][3][4];
		
		array[0][0][0] =10;
		array[0][0][1] =20;
		array[0][0][2] =30;
		array[0][0][3] =40;
		
		
		array[0][1][0] =50;
		array[0][1][1] =50;
		array[0][1][2] =70;
		array[0][1][3] =80;
		
		array[0][2][0] =90;
		array[0][2][1] =100;
		array[0][2][2] =110;
		array[0][2][3] =120;
		
		
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				for(int k=0;k<array[i][j].length;k++)
				{
					System.out.print(array[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		array3d obj=new array3d();
		obj.function();
	}

}
