package dayofbirth;


import java.util.Scanner;

/**
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
        System.out.print("Enter the first two digits of the year you were born : \n");
        int century = input.nextInt();

        // Ask for the month
        System.out.print("Enter the month you were: 1-12: \n");
        int month = input.nextInt();

        // Ask for the day
        System.out.print("Enter the day of the month you were born: \n");
        int day = input.nextInt();

        // If the birthday is in the first two months of the year, we have to go back one year
        switch(month) {
            case 1:
                month = 11;
                year = year -1;
                break;
            case 2:
                month = 12;
                year = year -1;
                break;
            default:
                month = month -2;
        }


        // Create Zeller Formula
        int f = (day + ((month * 26 - 2) / 10) + year + (year / 4) + (century / 4) + (5 * century)) % 7;


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





