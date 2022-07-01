package org.college;

public class Student extends College 
{
	public void studentName()
	{
		System.out.println("The Student Name is VijayaLakshmi");
	}
	public void studentDept()
	{
		System.out.println("My Department is MBA");
	}
	public void studentId()
	{
		System.out.println("The Student Id is 1233");
	}
	
	public static void main(String[] args)
	{
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		
		s.studentName();
		s.studentDept();
		s.studentId();
		
		
	}
	
}
