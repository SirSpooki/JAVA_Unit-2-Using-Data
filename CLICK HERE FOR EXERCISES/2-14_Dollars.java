/*
    SirSpooki
    SlayTeam 2023
*/
import java.util.Scanner;
class Dollars {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        int money = scan.nextInt();

        int twenties = money/20;
        int tens = (money%20)/10;
        int fives = ((money%20)%10)/5;
        int ones = ((money%20)%10)%5;

        System.out.println(money+" converted is "+twenties+" $20s, "+tens+" $10s, " +fives+" $5s, and "+ones+" $1s.");

        
        
    }
}
