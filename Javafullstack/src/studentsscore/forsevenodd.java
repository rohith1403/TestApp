package studentsscore;

import java.util.Scanner;

public class forsevenodd {

	public static void main(String[] args) {
		int i,sum1=0,sum2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int num=sc.nextInt();
		for(i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				sum1=sum1+i;
			}
			else
			{
				sum2+=i;
			}
		}
		System.out.println("sum of even numbers:"+sum1);
		System.out.println("sum of odd numbers:"+sum2);


	}


	}

