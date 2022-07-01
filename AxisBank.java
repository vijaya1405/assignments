package week3.day1;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		
		System.out.println("Overriding of method deposits() in the Class AxisBank");
	}
	
	
		public static void main(String[] args)

		{
			
			AxisBank axis=new AxisBank();
			axis.deposit();
			axis.saving();
			axis.fixed();
			
			
		
	}

}
