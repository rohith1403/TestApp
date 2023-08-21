package arrays;

public class descendingorder
 {

	public static void main(String[] args) 
	{
		int a[]= {7,2,3,1,9,8,10};
		int temp=0;
		for (int i=0;i<a.length;i++) 
		{
			for (int j=i+1;j<a.length;j++) 
			{
				if (a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("the array values are");
		for(int k=0;k<a.length;k++) 
		{
			System.out.print(a[k]+" ");
		}
	}

}
