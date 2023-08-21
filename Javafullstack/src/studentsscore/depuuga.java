package studentsscore;

public class depuuga 
  {
    int a,b,c;
    depuuga(int a)
    {
    	this.a=a;
    	
    	
    }
    depuuga(int a,int b)
    {
    	this.a=a;
    	this.b=b;
    }
       depuuga(int a,int b,int c)
       {
    	   this.a=a;
    	   this.b=b;
    	   this.c=c;
       }
       public void show() {
       System.out.println("the a value is"+a);
       System.out.println("the b value is "+b);
       System.out.println("the c value is"+c);
       }
	public static void main(String[] args) {
		depuuga c1=new depuuga(20);
		depuuga c2=new depuuga(40,30,60);
		depuuga c3=new depuuga (80,10);
		c1.show();
		c2.show();
		c3.show();

	}

}
