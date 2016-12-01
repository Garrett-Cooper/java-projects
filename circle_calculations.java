/*
 *First Java Program
 *09/15/2014
 *Author:  Garrett Cooper
 *Circle Information Program
*/

import java.text.DecimalFormat;

public class Circle_Information_HW {

    public static void main(String[] args) {

      //instantiate a DecimalFormat object specfiying a patter for two decimals
        DecimalFormat circlePattern = new DecimalFormat("#0.00");

      //***** 1. declare constant PI (i.e. 3.14159)
        final double C_P = Math.PI;

      //***** 2.  declare radius of circle, in inches, as a double
	  double tempR = 3.2;

      //***** 3. calculate area of cicle

            //the area of a circle = PI * radius^2;

	  double area = C_P * Math.pow(tempR, 2);

      //***** 4. calculate the perimeter of a circule

            // the perimeter of a circle = 2 * PI * radius;

          double perimeter = 2.0 * C_P * tempR;

      //***** 5. print out area and perimeter solution, etc.

           System.out.println("CIT111 Fall 2014 Assignment 1");
           System.out.println("Garrett Cooper");
           System.out.println("Circle Information");
           System.out.println("\nFor a circle with radius of " +tempR+ " inches:");
           System.out.println("\nThe area = " + circlePattern.format(area)+ " square inches");
           System.out.println("The perimeter = " + circlePattern.format(perimeter) + " inches");
           System.out.println("\nThank you for computing circle statistics today.");
    }

}
