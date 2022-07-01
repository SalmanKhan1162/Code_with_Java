package Pkg_01;

public class ABC 
{
	public ABC()
	{
		this(34,45);
		System.out.println("default constroctor ");
	}
	
	public ABC(int a)
	{
		System.out.println("one parametraize constroctor ");
	}
	
	public ABC(int a,int b)
	{
		this(65);
		System.out.println("two parametraize constroctor ");
	}
	public static void main(String[] args) 
	{
		ABC ob1=new ABC();
		
	}
		
}
