package dayofbirth;

import java.util.Scanner;

/**
 *
 * This simple app will ask the user for specific input and puts this input in the Zeller formula
 * to print the day of birth.
 *
 */

public class Zeller {

    public static void main(String[] args) {

        //Instance scanner
        Scanner input = new Scanner(System.in);

        // Ask for the year
        System.out.println("Enter the last two digits of the year you were born: ");
        int year = input.nextInt();

        // Ask for the century
        System.out.print("Enter the first two digits of the year you were born : ");
        int century = input.nextInt();

        // Ask for the month
        System.out.print("Enter the month you were: 1-12: ");
        int month = input.nextInt();

        // Ask for the day
        System.out.print("Enter the day of the month you were born: ");
        int day = input.nextInt();

        // Create Zeller Formula
        int f = (day + (((month - 2) * 26 - 2) / 10) + year + (year / 4) + (century / 4) + (5 * century)) % 7;


        String result = "The day you were born was: ";

        // Outcome in a switch to print the day of birth
        switch (f) {
            case 0:
                System.out.print(result + "Sunday");
                break;
            case 1:
                System.out.print(result + "Monday");
                break;
            case 2:
                System.out.print(result + "Tuesday");
                break;
            case 3:
                System.out.print(result + "Wednesday");
                break;
            case 4:
                System.out.print(result + "Thursday");
                break;
            case 5:
                System.out.print(result + "Friday");
                break;
            case 6:
                System.out.print(result + "Saturday");
                break;
        }
    }
}