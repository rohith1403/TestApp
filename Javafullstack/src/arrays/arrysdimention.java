package arrays;

import java.util.Scanner;
class emp4
{
	int id;
	String names;
	emp4 (int id,String names){
		this.id=id;
		this.names=names;
	}
	public void disply() {
		System.out.println("id:"+id);
		System.out.println("name:"+names);
	}

	public class arrysdimentional {
		public static void main(String[] args) {
			emp4[]e=new emp4[2];
			Scanner sc=new Scanner (System.in);
			for (int i=0;i<e.length;i++)
			{
				System.out.println("enter the value for id");
				int id=sc.nextInt();
				System.out.println("enter the value for name");
				String name=sc.next ();
				e[i]=new emp4(id,name);
				System.out.println();
				System.out.println("the values in array are");
			}
				for (int j=0; j<e. length;j++)
				{
					emp4 l=e[j];
					l.disply();
				}

			
		}

	}
}
