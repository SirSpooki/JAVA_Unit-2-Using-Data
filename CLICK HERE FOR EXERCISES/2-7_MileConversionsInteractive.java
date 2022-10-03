/*
    SirSpooki
    SlayTeam 2023
*/
import java.util.Scanner;
class MileConversionsInteractive
{
   public static void main(String[] args) {
      // Modify the code below
      final double INCHES_IN_MILE = 63360;
      final double FEET_IN_MILE = 5280;
      final double YARDS_IN_MILE = 1760;

      double miles;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter miles");
      miles = scan.nextDouble();

      double in, ft, yds;
      in = miles * INCHES_IN_MILE;
      ft = miles * FEET_IN_MILE;
      yds = miles * YARDS_IN_MILE;
      System.out.println(miles + " miles is " + in + 
         " inches, or " + ft + " feet, or " + 
         yds + " yards");
   }
}
