package arrays;

public class three_d_arrays {

	public static void main(String[] args) 
	{
	int a[][][]= {{{1,2,3,5},{1,3,5,6}},{{4,6,7,9},{9,4,6,2}}};	
	for(int i=0;i<2;i++) 
	{
		for (int j=0;j<2;j++) 
		{
			for (int k=0;k<4;k++) 
			{
				System.out.print(a[i][j][k]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	}

}
