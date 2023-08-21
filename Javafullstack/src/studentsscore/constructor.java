package studentsscore;
public class constructor 
{
	int empid;
	static String companyname;
	constructor  ( int empid,String companyname)
	{
		this.empid=empid;
		this.companyname=companyname;
	}
      public void display()
      {
    	  System.out.println("the empid is"+empid);
    	  System.out.println("the companyname is"+companyname);
      }
        public static void main (String[]args) 
        {
        	constructor  e1=new constructor  (101,"abc");
        	constructor e2=new constructor (102,"xyz");
        	e1.display();
        	e2.display();
        }
}
