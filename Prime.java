package week1.day1;

public class Prime
{
 public static void main(String args[])
 {
	 int primeNum=13,i;
	 boolean pri=false;
	 for(i=2;i<=13/2;++i)
	 {
		 if(primeNum%i==0)
		 {
			 pri=true;break;
		 }
	 }
	 if(!pri)
	 System.out.println(primeNum+ " is a prime number");
	 else
		 System.out.println(primeNum+"is not a prime number");
 }
}
