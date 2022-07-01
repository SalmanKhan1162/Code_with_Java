package Pkg_01;
//((((10+2)+2)-2)*2)/2)
public class Arithmetic2 
{
   public int sum(int a, int b, int c )
   {
    int x;
	x=a+b+c;
	System.out.println("sum result is "+c);
	return x;	   		   
   }
   public int sub(int a1, int b1)
   {
	   int x1;
	   x1=a1-b1;
	   System.out.println("substract result is "+x1);
	   return x1;	   
   }
	public int multi(int a2, int b2)
	{
		int x2;
		x2=a2*b2;
		System.out.println("multi result is "+x2);
		return x2;		
	}
	public void div(int a3, int b3)
	{
		int x3;
		x3=a3/b3;
		System.out.println("Arithmetic final result is "+x3);	
	}
	public static void main(String[] args) 
	{
		Arithmetic2 sk=new Arithmetic2();
		
		int sumResult=sk.sum(10, 2, 2);
		int subResult=sk.sub(sumResult, 2);
		int multiResult=sk.multi(subResult, 2);
		sk.div(multiResult, 2);		
	}
	
	
}
