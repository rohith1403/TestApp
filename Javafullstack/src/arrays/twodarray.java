package arrays;

public class twodarray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},{6,7,5,8},{1,4,3},{8,7}};
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
		}
	}

}
