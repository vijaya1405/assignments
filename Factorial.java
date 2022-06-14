package week1.day1;

public class Factorial
{
public static void main(String args[])
{
	int factNum=1, i;
	long factorial=1;
	for(i=1;i<=factNum;++i)
	{
		factorial*=i;
	}
	System.out.println("Factorial of a number is = "+factorial);
}
}
