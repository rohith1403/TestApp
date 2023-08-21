package studentsscore;

public class constructorexample 
{
   int empid;
   String name;
   constructorexample()
   {
	   empid=101;
	   name="ABC";
   }
     constructorexample(int empid,String ename)
     {
    	 empid=200;
    	 name="xyz";
     }
        public void display () 
        {
        	System.out.println("the empid is"+empid);
        	System.out.println("the ename is"+name);
        }
            public static void main(String[]args) 
            {
               constructorexample c=new constructorexample();
               c.display();
            	constructorexample c1=new constructorexample(200,"xyz");
            	c1.display();
            }
}
