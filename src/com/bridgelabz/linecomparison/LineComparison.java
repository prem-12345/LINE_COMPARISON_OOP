package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {

    // WELCOME TO LINE COMPARISON COMPUTATION OOP

    public double calculateLength() {

        // UC1 CALCULATE THE LENGTH OF LINE

        //taking variables for co-ordinates of line

        int x1, x2, y1, y2;

        //taking user inputs for co-ordinates of line

        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1 point");
        x1 = input.nextInt();
        System.out.println("Enter x2 point");
        x2 = input.nextInt();
        System.out.println("Enter y1 point");
        y1 = input.nextInt();
        System.out.println("Enter y2 point");
        y2 = input.nextInt();

        //computing length of line
        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        //printing the legth of line
        System.out.println("Length of the line between points " + "(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ") = " + length);
        return length;
    }

    public void equalityOfLines() {

        // UC2 CHECK THE EQUALITY OF TWO LINES

        double Length_line1;
        double Length_line2;


        System.out.println("SET THE CO-ORDINATES OF LINE 1");
        Length_line1 = calculateLength();

        System.out.println("SET THE CO-ORDINATES OF LINE 2");
        Length_line2 = calculateLength();

        if (Length_line1 == Length_line2) {
            System.out.println("The lengths are equal");
        } else {
            System.out.println("The lengths are not equal");
        }

    }

    public void compareTwoLines() {

        // UC3 COMPARISON OF TWO LINES

        double Length_line1;
        double Length_line2;


        System.out.println("SET THE CO-ORDINATES OF LINE 1");
        Length_line1 = calculateLength();

        System.out.println("SET THE CO-ORDINATES OF LINE 2");
        Length_line2 = calculateLength();

        if (Length_line1 == Length_line2) {
            System.out.println("The length of line 1 is equal to length of line 2");
        } else if (Length_line1 > Length_line2) {
            System.out.println("The length of line 1 is greater then length of line; 2");
        } else {
            System.out.println("The length of line 1 is less then length of line 2");
        }


    }
}



