package arrays;

public class twodimenstional
{

	public static void main(String[] args)
	{
		int [][]a=new int  [3][3];
		int count=0;
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				a[i][j]=count;
				count++;
			}
		}
		for (int k=0;k<3;k++)
		{
			for (int l=0;1<3;l++) 
			{
				System.out.print(a[k][l]+" ");	
			}
			
		}
		
		}
	
}










