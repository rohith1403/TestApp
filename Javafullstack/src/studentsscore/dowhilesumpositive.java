package studentsscore;
import java.util.Scanner;
public class dowhilesumpositive {

	public static void main(String[] args)
	{
		int a,i=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit:");
		int num=sc.nextInt();
		do
		{
			System.out.println("enter numbers:");
			a=sc.nextInt();
			if(a>0)
			{
				sum+=a;
			}
			i++;
			
		}
		while(num>=i);
		System.out.println("The sum of positive numbers:"+sum);

	}

}
