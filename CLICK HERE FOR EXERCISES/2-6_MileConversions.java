
/*
    SirSpooki
    SlayTeam 2023
*/
class MileConversions {
    public static void main(String[] args) 
    {
        final float INCHES_IN_MILE = 63360;
        final float FEET_IN_MILE = 5280;
        final float YARDS_IN_MILE = 1760;
        float miles = 4;

        double inchMiles=miles*INCHES_IN_MILE;
        double feetMiles=miles*FEET_IN_MILE;
        double yardMiles=miles*YARDS_IN_MILE;




        System.out.println(miles + " miles is " + inchMiles + " inches, or " + feetMiles + " feet, or " + yardMiles + " yards ");
    }
}
