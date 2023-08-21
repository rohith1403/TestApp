package studentsscore;
import java.util.Scanner;
public class dowhileevenodd {

	public static void main(String[] args)
	{
		int a,i=1,sum1=0,sum2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit:");
		int num=sc.nextInt();
		do
		{
			System.out.println("enter numbers:");
			a=sc.nextInt();
			if(a%2==0)
			{
				sum1+=a;
			}
			else if(a%2!=0)
			{
				sum2+=a;
			}
			i++;
			
		}
		while(num>=i);
		System.out.println("The sum of even numbers:"+sum1);
		System.out.println("The sum of odd numbers:"+sum2);

	}

}
