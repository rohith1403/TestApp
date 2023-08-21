package arrays;
public class count12 {

	public static void main(String[] args)
	{
		int a[]= {3,7,9,5,6,7,89,24,7,5},oddc=0,evenc=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenc++;
			}
			else if(a[i]%2!=0)
			{
				oddc++;
			}
		}
		System.out.println("no.of even elements:"+evenc);
		System.out.println("no.of odd elements:"+oddc);
	}

}
