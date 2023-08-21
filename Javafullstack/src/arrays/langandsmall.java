package arrays;
import java.util.Scanner;
public class langandsmall {

	public static void main(String[] args)
	{
		int num,large=0,small=0;
        char ch;
        Scanner sc=new Scanner(System.in);
        do
        {
        	System.out.println("Enter number:");
        	num=sc.nextInt();
        	if(num>large)
        	{
        		large=num;
        	}
        	else if(num==0)
        	{
        		break;
        	}
            if(num<small||small==0)
        	{
        		small=num;
        	}
        	System.out.println("Do you want to continue y or n ?");
        	ch=sc.next().charAt(0);
        	if(ch=='n'||ch=='N')
        	{
        		break;
        	}
        }
        while(true);
        System.out.println("The largest number is:"+large);
        System.out.println("The smallest number is:"+small);

	}

}