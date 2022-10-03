/*
    SirSpooki
    SlayTeam 2023
*/
import java.util.Scanner;
public class DebugTwo4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String costString;
      int cost;
      final double TAX = 0.06;
      System.out.println("Enter price of item you are buying");
      costString = input.next();
      cost = Integer.parseInt(costString);
      System.out.println("With " + TAX * 100 +
      "% tax,  purchase  is $" + (cost+(cost * TAX)));
   }
}
