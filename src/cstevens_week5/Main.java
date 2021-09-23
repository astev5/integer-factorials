package cstevens_week5;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 5 Assignment
 * @Date: Jun 14, 2021
 * @Description: Loops
 */

//Imports
import java.math.BigInteger;
import java.util.Scanner;
//Begin Class Main

public class Main {

    //Begin Main Method
    public static void main(String[] args) {

        // create an object of the Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to my factorial program!\n");
        System.out.print("Please choose from one of the following:\n");
        System.out.print("1. Run Program\n");
        System.out.print("2. Exit Program\n");

        // get user input for main menu selection
        int choice = sc.nextInt();

        // SWITCH CASE for menu items
        switch (choice) {

            // option 1: run program
            case 1:
                System.out.print("\nThis program will determine the factorial "
                        + "value of positive integers.\n");

                // declare input type for run again option
                String again;

                // do while loop to run program again
                do {
                    System.out.print("\nThe starting number is 1.\n");
                    System.out.print("Please enter an ending integer value: ");

                    // get input for ending integer
                    int endnum = sc.nextInt();
                    sc.nextLine();

                    // use BigInteger to accomodate values of 20
                    BigInteger factorial = BigInteger.ONE;

                    // for loop to generate factorial
                    for (int i = 1; i <= endnum; i++) {
                        factorial = factorial.multiply(BigInteger.valueOf(i));
                        System.out.printf("%d! = %d\n\r", i, factorial);
                    }
                    System.out.print("Run factorial program again? (Y for Yes, "
                            + "N for No): ");

                    // get input for continue again selection                
                    again = sc.nextLine();
                } while ((again.equals("Y")) || (again.equals("y")));

                while ((again.equals("N")) || (again.equals("n"))) {
                    System.out.print("Thank you for using the factorial "
                            + "program! Goodbye!\n\n");
                    System.exit(0);
                }

            // option 2: exit program
            case 2:
                System.out.print("Thank you for using the factorial program! \n"
                        + "Exiting program. Goodbye!\n\n");
                System.exit(0);

            // default: in case of invalid selection
            default:
                System.out.print("Invalid selction. Exiting program.\n\n");
                System.exit(1);
        }
    } //End Main Method

} //End Class Main
