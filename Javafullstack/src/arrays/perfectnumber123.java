package arrays;

import java.util.Scanner;

public class perfectnumber123 {

	public static void main(String[] args)
	{
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
        num=sc.nextInt();
        for(int i=1;i<num;i++)
        {
        	if(num%i==0)
        	{
        		sum+=i;
        	}
        }
        if(sum==num)
        {
        	System.out.println(num+" is a perfect number!");
        }
        else 
        {
        	System.out.println(num+" is not a perfect number!");
        }
	}
}
