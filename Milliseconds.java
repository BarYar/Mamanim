import java.util.Scanner;
/**
 * Name: Bar Yaron      
 * The Milliseconds class main method converts the user input in milliseconds to Days, Hours, Minutes and Seconds.
 */
public class Milliseconds
{
    public static void main (String [] args)
    {
        final int MS_IN_SECONDS = 1000, MS_IN_MINUTES = MS_IN_SECONDS * 60, MS_IN_HOURS = MS_IN_MINUTES * 60, MS_IN_DAYS = MS_IN_HOURS * 24; // final vars for the milliseconds to other time units conversion
        long seconds, minutes, hours, days;
        System.out.println ("This program reads an integer which " +
                "represents Milliseconds and converts it to days, " +
                "hours, minutes and seconds. ");
        System.out.println ("Please enter the number of Milliseconds");
        Scanner scan = new Scanner (System.in);
        long ms = scan.nextLong();
        days = ms / MS_IN_DAYS;
        ms = ms - days * MS_IN_DAYS;
        hours = ms / MS_IN_HOURS;
        ms = ms - hours * MS_IN_HOURS;
        minutes = ms / MS_IN_MINUTES;
        ms = ms - minutes * MS_IN_MINUTES;
        seconds = ms / MS_IN_SECONDS;
        System.out.println(days + " days " + hours+ ":" + minutes + ":" + seconds +" hours");

    }//main
}//Milliseconds class