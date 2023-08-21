package leepyear;

import java.util.Scanner;

public class leepyear {
public static void main(String[]args)
{
	Scanner sc=new Scanner (System.in);
    System.out.println("enter your input:");
    int num=sc.nextInt();
    if (num%4==0)
    {
    	System.out.println("it is leep year");
    }
    else	
    {
    	System.out.print("not a leep year");
    }
}

}
 

 