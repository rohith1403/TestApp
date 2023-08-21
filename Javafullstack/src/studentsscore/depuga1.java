package studentsscore;

public class depuga1 
  {
	int a,b,c;
	depuga1(int a)
	{
		this.a=a;
	}
      depuga1(int a, int b)
      {
    	  this.a=a;
    	  this.b=b;
      }
      depuga1(int a,int b,int c)
      {
    	  this.a=a;
    	  this.b=b;
    	  this.c=c;
      }
      public void show() 
      {
        System.out.println("the a value is"+a);
        System.out.println("the b value is"+b);
        System.out.println("the c value is"+c);
      }
	public static void main(String[] args) {
		depuga1 c1=new depuga1(20);
	    depuga1 c2=new depuga1(10,30);
	    depuga1 c3=new depuga1 (40,50,70);
	    c1.show();
	    c2.show();
	    c3.show();
		
	}

}
