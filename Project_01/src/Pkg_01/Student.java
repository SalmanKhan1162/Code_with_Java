package Pkg_01;

public class Student 
{  // boundry(body) of the class
	int a=10;
	public void deepak()
	{
		System.out.println("welcome to all of you ");
	}
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.deepak();
		s.deepak();
		System.out.println(s.a);
		s.a=133;
		System.out.println(s.a);
		s.a=11;
		System.out.println(s.a);
				
				
	}
}
