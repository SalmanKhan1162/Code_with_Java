
public class Student 
{
	int age=20;
	int rollno=12;
	public void display1()
	{
		System.out.println("welcome to all ");
		System.out.println("welcome to github ");
	}
	public void display2()
	{
		System.out.println("automation is very easy ");
	}
	public static void main(String[] args) 
	{
	  Student s=new Student();
	  s.display1();
	  s.display2();
		  System.out.println(s.age);
		  System.out.println(s.rollno);
	}
}
