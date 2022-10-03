/*
    SirSpooki
    SlayTeam 2023
*/
import java.util.Scanner;
class InchesToFeetInteractive
{    
  public static void main(String[] args) {
      // Modify the code below
     final int INCHES_IN_FOOT = 12;
     
     int inches;
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter inches: ");
     inches = scan.nextInt();

     int feet;
     int inchesLeft;
     feet = inches / INCHES_IN_FOOT;
     inchesLeft = inches % INCHES_IN_FOOT;
     System.out.println(inches + " inches is " +
        feet + " feet and " + inchesLeft + " inches"); 
  }
}
