class circle {
	 double radius ;
	 double area ;
	 void findarea()
	 {
	 area= 3.14*radius*radius;
	 }
	 void displayarea()
	 {
	 System.out.print(" THE AREA IS : "+area);

	 }
}
class circledemo {
	public static void main (String args [])
	{
	circle c = new circle();
	c.radius=2;
	c.findarea();
	c.displayarea(); 
	}
}	 