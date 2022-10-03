/*
    SirSpooki
    SlayTeam 2023
*/
import java.util.Scanner;
public class MinutesConversion {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of minutes: ");
        int userMinutes = scan.nextInt();

        double toHours = (double)userMinutes/60;
        double toDays = (double)toHours/24;

        System.out.println(userMinutes+" minutes is "+toHours+" hours or "+toDays+" days.");
    }
}
