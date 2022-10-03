/*
    SirSpooki
    SlayTeam 2023
*/
import java.util.Scanner;
class ElectionStatistics {
    public static void main(String[] args) 
    {
        int votes1, votes2, votes3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name for first party");
        String party1 = scan.nextLine();
        System.out.println("Enter votes recieved");
        votes1 = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter name for second party");
        String party2 = scan.nextLine();
        System.out.println("Enter votes recieved");
        votes2 = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter name for third party");
        String party3 = scan.nextLine();
        System.out.println("Enter votes recieved");
        votes3 = scan.nextInt();

        double totalVotes = votes1+votes2+votes3;
        double perc1 = (votes1/totalVotes)*100;
        double perc2 = (votes2/totalVotes)*100;
        double perc3 = (votes3/totalVotes)*100;

        System.out.println("The " +party1+" party got "+perc1+" percent of the vote");
        System.out.println("The " +party2+" party got "+perc2+" percent of the vote");
        System.out.println("The " +party3+" party got "+perc3+" percent of the vote");




    }
}
