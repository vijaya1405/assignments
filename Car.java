package week1.day2;

public class Car
{
void applyBreak()
{
	System.out.println("Break1");
}
void applyGear()
{
	System.out.println("Gear1");
}
void switchOnAc()
{
	System.out.println("Ac1");
}
void applyAccelerate()
{
	System.out.println("Acceleration1");
}
public static void main (String args[])
{
	Car car=new Car();
	car.applyBreak();
	car.applyGear();
	car.switchOnAc();
	car.applyAccelerate();
}
	
}
