package week2.day1;

public class ReverseEvenWords
{
public static void main(String[] args)
{
	
	String str = "I am a software tester"; 
	String[] words=str.split(" ");
	StringBuilder result = new StringBuilder();
	    for( int i = 0; i < words.length; i += 1 )
	    {
	        if( i % 2 != 0 )
	        {
	            char[] word = words[i].toCharArray();
	            String reverseWord = "";
	            for( int k = word.length; k > 0; k-- )
	            {
	                reverseWord += String.valueOf( word[k-1] );
	            }
	            result.append( reverseWord ).append( " " );
	        }
	        else
	        {
	            result.append( words[i] ).append( " " );
	        }
	    }
	    System.out.println( result.toString() );
		
		
		


}
}

