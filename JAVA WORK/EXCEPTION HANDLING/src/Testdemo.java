class Test
{
	void Display()
	{
	System.out.println (" TEST EXECUTED");
    }
}
 class Testdemo
 {
  public static void main( String args[])
{
	Test t =null;
	try{

  t.Display();	
  }
  catch( Exception e)
  {
  System.out.println(e);
}

 }  }
