import java.util.Scanner;
public class Datetest {
  public static void main ( String [] args) {
   date display = new date ( 0,0,0);
    Scanner input = new Scanner (System.in );
      int month ;
      int day ;
      int year;
       System.out.print ( " Enter Month");
       month= input.nextInt();
       display.setMonth(month);

        System.out.println();
        System.out.print (" Enter Day");
        day= input.nextInt();
        display.setday(Day);

        System.out.println ();
        System.out.print (" Enter Year");
        year = inut.nextInt();
        display.setyear(year);

        System.out.println ();

         display.displayDate();

         }

}
