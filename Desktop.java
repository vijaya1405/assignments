package org.system;

public class Desktop extends Computer
{
	public void desktopSize()
	{
		System.out.println("The desktop size is 1 inch=2.54 centimeters");
		
	}
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSize();
		
	}

}
