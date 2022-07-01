package Pkg_01;
//(((10/2)-2)-2)+2)*2)
public class Arithmetic3 
{
    public int div(int a, int b)
    {
    	int x;
    	x=a/b;
    	System.out.println("sum result is "+x);
    	return x;
    }
    public int sub1(int a1, int b1)
    {
    	int x1;
    	x1=a1-b1;
    	System.out.println("substract result is "+x1);
    	return x1; 	
    }
    public int sub2(int a2, int b2)
    {
    	int x2;
    	x2=a2-b2;
    	System.out.println("second substract result is "+x2);
    	return x2;
    }
    public int sum(int a3, int b3)
    {
    	int x3;
    	x3=a3+b3;
    	System.out.println("sum result is "+x3);
    	return x3;
    }
    public void multi(int a4, int b4)
    {
    	int x4;
    	x4=a4*b4;
    	System.out.println("the final result is "+x4);
    }
    public static void main(String[] args) 
    {
		Arithmetic3 sk=new Arithmetic3();
				
				int divResult=sk.div(10, 2);
		        int subResult1=sk.sub1(divResult, 2);
		        int subResult2=sk.sub2(subResult1, 2);
		        int sumResult=sk.sum(subResult2, 2);
		        sk.multi(sumResult, 2);	        
    }
	
}
