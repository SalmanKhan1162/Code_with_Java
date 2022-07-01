package Pkg_01;

public class salman2 
{
	public void m1()
	{
		this.m4(3, 4, 5);
		System.out.println("default contractor ");
	}
	public void m2(int a)
	{
		this.m1();
		System.out.println("one paramatriz contractor ");
	}
	public void m3(int a,int b)
	{
		this.m2(9);
		System.out.println("two paramatriz contractor ");
	}
	public void m4(int a,int b, int c)
	{
		System.out.println("three paramatriz contractor ");
	}
	public void m5(int a,int b, int c,int d)
	{
		this.m3(1, 5);
		System.out.println("four paramatriz contractor ");
	}
	public static void main(String[] args) 
	{
		salman2 sk=new salman2();
		sk.m5(1, 2, 3, 5);
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
