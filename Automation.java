package week3.day1;

public class Automation extends MultipleLanguage implements TestTool
{
   
	public void selenium() {     
		System.out.println("Iam Selenium from Execution Class");
	}

	@Override
	public void ruby() {          
		System.out.println("Iam Ruby From Abstract Class");	
	}
	public static void main(String[] args) {
		Automation call = new Automation();
		call.selenium();
		call.ruby();
		call.python();
}
}
