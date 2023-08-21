package studentsscore;
import java.util.Scanner;
public class dowhilelargest {

	public static void main(String[] args) 
	{
		int i,num,large=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("enter numbers:");
			num=sc.nextInt();
			if(num>large)
			{
				large=num;
			}
			System.out.println("do you want to continue y or n:");
			char a=sc.next().charAt(0);
			if(a=='n')
			{
				break;
			}
		}
		while(true);
		System.out.println("The largest number:"+large);



	}

}
