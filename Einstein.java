import java.util.Scanner;
/**
 * Name: Bar Yaron      
 * The Einstein class prints if the difference between the user input and the reverse number of the user input,
 * plus the reverse of the difference equals 1089 (Einstein puzzle).
 */
public class Einstein
{
    /**
     * Gets 3 digit input number from the user,
     * checks their legality (3 digit positive number and hundreds number and unit number different), 
     * in case of illegal time - prints appropriate notice.
     * Checks if the difference between the user input and the reversed user input + the reversed difference equals 1089.
     * If so, prints "SUCCEEDED", otherwise prints "FAILED".
     */
    public static void main(String[]args)
    {
        int reversedNum, hundreds, tens, units, diff, reversedDiff;
        System.out.println("Welcome to the Einstein magic game. \nPlease enter a 3 digit positive number whose first and last digits are different:");
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        // Checks if the input is a 3 digit positive number
        if ((num > 999) || (num < 100))
            System.out.println("The number you entered is not a 3 digit positive number");
        else
        {
            // Calculates the hundreds, tens and units of the input.
            hundreds = num / 100;
            tens = (num % 100) / 10;
            units = (num % 100) % 10;
            // Checks if the input's tens and hundreds number are equal.
            if (units == hundreds)
            {
                System.out.println("The  first  and  the  last  digits  of  the  number  should  be different.");
            }
            else
            {
                System.out.println("User number is: " + num);
                reversedNum = units * 100 + tens * 10 + hundreds;
                // Calculates the difference and the reversed difference
                diff = Math.abs(num - reversedNum);
                System.out.println("Difference: " + diff);
                hundreds = diff / 100;
                tens = (diff % 100) / 10;
                units = (diff % 100) % 10;
                reversedDiff = units * 100 + tens * 10 + hundreds;
                System.out.println("Reversed difference: " + reversedDiff);
                // Prints if the magic succeeded.
                if (diff + reversedDiff == 1089)
                    System.out.println("SUCCEEDED");
                else
                    System.out.println("FAILED");

            }//else
        }//else
    }//main
}//Einstein class
