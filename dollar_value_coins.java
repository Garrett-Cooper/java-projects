/*
 *CIT 111 Intro to Programming
 *First Java Program
 *09/17/2014
 *Author:  Garrett Gcooper
 *Dollar Value of Coins HW Program #2
*/

package dollarvalueofcoins;

    //Imported Java Utility & Jave Text Packages for Scanner & Format Classes

import java.util.Scanner;
import java.text.DecimalFormat;

public class DollarValueOfCoins {

    public static void main(String[] args) {

    //Create a Scanner object for reading coin amounts as integers
        Scanner console = new Scanner (System.in);

    //Create a DecimalFormat object for printing U.S. dollar currency
        DecimalFormat coinPattern = new DecimalFormat("$#0.00");

    //Define coin variables as integers and total amount as double
    //quarterAmt will hold how many quarters the user enters into the program
    //dimeAmt will hold how many dimes the user enters into the program
    //pennyAmt will hold how many pennies the user enters into the program
    //totalAmt will hold the total amount of each item adjusted for its worth
        int quarterAmt, dimeAmt, pennyAmt;
        double totalAmt;

    //Prints out header information
        System.out.println("CIT111 Fall 2014 Assignment 2");
        System.out.println("Garrett Cooper");
        System.out.println("Dollar Value of Coins");

    //Asks the user to enter how many quarters they own
        System.out.print("\nPlease enter the number of quarters: ");

    //quarterAmt holds the amount of quarters the user entered
        quarterAmt = console.nextInt();

    //Asks the user to enter how many dimes they own
        System.out.print("Now enter the number of dimes: ");

    //dimeAmt holds the amount of dimes the user entered
        dimeAmt = console.nextInt();

    //Asks the user to enter how many pennies they own
        System.out.print("Finally, enter the number of pennies: ");

    //pennyAmt holds the amount of pennies the user entered
        pennyAmt = console.nextInt();

    //totalAmt calculates the total dollar amount the user entered
        totalAmt = (quarterAmt * 0.25) + (dimeAmt * 0.10) + (pennyAmt * 0.01);

    //Prints out to the user the properly formatted total dollar amount entered
        System.out.println("\nThe total amount of money you have is: "
                            + coinPattern.format(totalAmt));

    //Prints out a thank you message and version of the program
        System.out.println("\nThank you for using the Coin "
                                + "Counter Deluxe Version 1.3\n");

    }

}
