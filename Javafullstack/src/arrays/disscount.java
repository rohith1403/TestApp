package arrays;

import java.util.Scanner;

public class disscount {

	public static void main(String[] args)
	{
		int price,quantity,expenses;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price:");
		price=sc.nextInt();
		System.out.println("Enter quantity:");
		quantity=sc.nextInt();
		expenses=price*quantity;
		if(quantity>100)
		{
			double dis=0.1*price*quantity;
			expenses-=dis;
		}
		System.out.println("The total expenses is:"+expenses);
		
		
		

	}

}