class box {
	double width ;
	double height ;
	double depth ;

box() {
System.out.println("  constructing box");
   width = 10;
   height= 10;
   depth = 10;
   }
   box(double w,double h, double d) {
   width = w;
   height = h;
   depth = d;
   }
   box(double len)
   {
      width=height=depth=len;

   }
   double volume () {
   return width*height*depth;
   }
}
   class BoxDemoA{
 public static void main (String args [])
 {
   box mybox1 = new box ();
    box mybox2 = new box (3,6,9);
    double vol;
    vol = mybox1.volume();
    System.out.println (" Volume is " + vol);
    vol = mybox2.volume();
    System.out.println( "Volume is" + vol );
    box mycube =new box(7);
    vol = mycube.volume();
    System.out.println( "Volume of mycube is" + vol );
    // vol =mybox3.volume();
    //System.out.println( "Volume is" + vol );
    }
 }
