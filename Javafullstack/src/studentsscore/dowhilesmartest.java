package studentsscore;
import java.util.Scanner;
public class dowhilesmartest {

	public static void main(String[] args) 
	{
		int i,num,b=0,small=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("enter numbers:");
			num=sc.nextInt();//10
			if(num<small || small==0)
			{
				small=num;
			}
			else if(num==0)
			{
				break;
			}
			System.out.println("do you want to continue y or n:");
			char a=sc.next().charAt(0);
			if(a== 'n')
			{
				break;
			}
		}
		while(true);
		System.out.println("The smallest number:"+small);

	}

}
