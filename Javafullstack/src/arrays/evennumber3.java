package arrays;

public class evennumber3 
{
	public static void main(String[] args) 
	{
		int a[]= {1,3,5,6,8,15,45,65,76};
		System.out.println("The even elements in a:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
	}
}