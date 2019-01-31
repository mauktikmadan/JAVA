import java.util.*;
class ExceptionTest
{
	  public static void main( String args[])
	  {
	  String s ;
	  Scanner scan = new Scanner(System.in);
	  s = scan.next();
	  try
	  {
	  if(s==null)
	  {
	  throw new Exception ( " YOU ENTERED A NULL STRING");

	  }
	  else {
	  System.out.println("THE ENTERED STRING IS :" +s);

	  }
}
   catch( Exception e) { System.out.println(e);}
   finally
   {
   System.out.println(" THE PROGRAM EXECUTED SUCCEFULLY");
   }
   }
   }