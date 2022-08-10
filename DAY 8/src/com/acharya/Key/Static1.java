package com.acharya.Key;

public class Static1
{         
	int rollno;
	String name;
	static String college="AIT";
    
	Static1(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args)
	{
		Static1 s1=new Static1(111,"kiran");
		Static1 s2=new Static1(222,"prajwal");
		s1.display();
		s2.display();
	}

}