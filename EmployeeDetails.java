package week1.day2;

public class EmployeeDetails
{
	void printEmployeeName(String empName,int empId)
	{
		System.out.println(empName+" , "+empId);
	}
	void printEmloyeeAdress(String empAddress)
	{
		System.out.println(empAddress);
	}
	void printEmployeeSalary(double emSalary)
	{
		System.out.println(emSalary);
	}
	void printEmloyeeMobileNumber(long mobNum)
	{
		System.out.println(mobNum);
	}
	public static void main(String args[])
	{
		EmployeeDetails employee=new EmployeeDetails();
		
		employee.printEmployeeName("yaswanth", 5);
		employee.printEmloyeeAdress("chennai");
		employee.printEmployeeSalary(50000.00);
		employee.printEmloyeeMobileNumber(9014283663l);
	}
	
	}
	
