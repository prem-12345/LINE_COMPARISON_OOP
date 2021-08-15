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


}



