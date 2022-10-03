/*
    SirSpooki
    SlayTeam 2023
*/
import java.util.Scanner;
class Eggs {
    public static void main(String[] args) 
    {
        final double dozenPrice = 3.25;
        final double eggPrice = .45;

        int userEggs;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of eggs: ");
        userEggs = scan.nextInt();

        int dozenEggs = userEggs/12;
        int looseEggs = userEggs%12;

        double total = (dozenEggs*dozenPrice) + (looseEggs*eggPrice);

        System.out.println("You ordered "+userEggs+" eggs. That's "+dozenEggs+" dozen at $3.25 per dozen and "+
        looseEggs+" loose eggs at 45 cents each for a total of " + "$"+total+"."); 
    }
}
