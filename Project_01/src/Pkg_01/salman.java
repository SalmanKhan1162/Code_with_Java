package Pkg_01;

public class salman
{
   public salman()
   {
	   this(4, 6, 3);
	   System.out.println("default contractor ");
   }
   public salman(int a)
   {
	   this();
	   System.out.println("one paramateriz contractor ");
   }
   public salman(int a,int b)
   {
	   this(2);
	   System.out.println("two paramateriz contractor ");
   }
   public salman(int a,int b,int c)
   {
	   System.out.println("three paramateriz contractor ");
   }
   public salman(int a,int b,int c,int d)
   {
	   this(5, 8);
	   System.out.println("four paramateriz contractor ");
   }
   public static void main(String[] args) 
   {
	   salman  ob=new salman(1,3,4,8);
}
	
	
	
}
