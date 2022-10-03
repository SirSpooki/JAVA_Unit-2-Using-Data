/*
    SirSpooki
    SlayTeam 2023
*/
import java.util.Scanner;
class ChiliToGoProfit
{
  public static void main(String[] args) 
  {
      final double ADULT_PRICE = 7;
      final double CHILD_PRICE = 4;
      final double adultProduce = 4.35;
      final double childProduce = 3.10;

      int adultMeals;
      int childMeals;
      double totalAdult, totalChild, grandTotal, adultProfit, childProfit, totalProfit;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of adult meals ordered >> ");
      adultMeals = input.nextInt();
      System.out.print("Enter number of child meals ordered >> ");
      childMeals = input.nextInt();

      totalAdult = adultMeals * ADULT_PRICE;
      totalChild = childMeals * CHILD_PRICE;
      grandTotal = totalAdult + totalChild;

      double produceCostAdult = adultMeals*adultProduce;
      adultProfit = totalAdult - produceCostAdult; 
      double produceCostChild = childMeals*childProduce;
      childProfit = totalChild - produceCostChild;
      totalProfit = adultProfit+childProfit;

      System.out.println(adultMeals + " adult meals were ordered at " + ADULT_PRICE + " each.");
      System.out.println("      Total is " + totalAdult);
      System.out.println(childMeals + " child meals were ordered at " + CHILD_PRICE + " each.");
      System.out.println("      Total is " + totalChild);
      System.out.println("Grand total for all meals is " + grandTotal);

      System.out.println("Profits:");
      System.out.println("      Adult profit is " + adultProfit);
      System.out.println("      Child profit is " + childProfit);
      System.out.println("Total profit is  " + totalProfit);

   }
}
