package studentsscore;

import java.util.Scanner;

public class whiledivision {

	public static void main(String[] args) {
		int i=1,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter interger:");
		a=sc.nextInt();
		while(a>=i)
		{
			if(a%i==0)
			{
			 System.out.println("The divisiables of "+a+" is "+i);
			}
			i++;
		}
	}

}
