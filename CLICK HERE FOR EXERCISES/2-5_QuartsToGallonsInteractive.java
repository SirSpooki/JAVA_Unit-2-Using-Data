/*
    SirSpooki
    SlayTeam 2023
*/
import java.util.Scanner;
class QuartsToGallonsInteractive

{
   public static void main(String[] args) 
   {   
      // Modify the code below
      final int QUARTS_IN_GALLON = 4;

      int quartsNeeded;
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Enter quarts needed");
      quartsNeeded = inputDevice.nextInt();
      
      int gallonsNeeded;
      int extraQuartsNeeded;
      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts."); 
   }
}
