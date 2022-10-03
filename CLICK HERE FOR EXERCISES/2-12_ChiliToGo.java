/*
    SirSpooki
    SlayTeam 2023
*/
import java.util.Scanner;
class ChiliToGo {
    public static void main(String[] args) 
    {
        final double adultCost = 7;
        final double childCost = 4;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of adult meals ordered ");
        int adultMeals = scan.nextInt();
        //Children meals
        System.out.println("Enter number of child meals ordered ");
        int childMeals = scan.nextInt();

        double adultMath = adultMeals*adultCost;
        double childMath = childMeals*childCost;
        double total = adultMath+childMath;

        System.out.println(adultMeals+" adult meals were ordered at 7.0 each.");
        System.out.println("      Totals is " + childMath);
        System.out.println(childMeals+" child meals were ordered at 4.0 each.");
        System.out.println("      Total is " + adultMath);
        System.out.println("Grand total for all meals is " + total);




         
    }
}
