package studentsscore;
import java.util.Scanner;
public class method1 
 {
public double translate (int num)
{
	return num;
}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		method1 m=new method1();
		System.out.println("enter num");
		int a=sc.nextInt();
		double result=m.translate(a);
		System.out.printf("%.2f",result);
		

	}

}
