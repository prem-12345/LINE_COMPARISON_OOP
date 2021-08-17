package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {

    // WELCOME TO LINE COMPARISON COMPUTATION OOP

    static String strLength1;
    static String strLength2;

    public double calculateLength() {

        // UC1 CALCULATE THE LENGTH OF LINE

        int x1, x2, y1, y2;

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
        System.out.println("Length of the line between points " + "(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ") = " + length);
        return length;
    }

    public void equalityOfLines() {

        // UC2 CHECK THE EQUALITY OF TWO LINES BY USING JAVA EQUALSTO METHOD

        System.out.println("SET THE CO-ORDINATES OF LINE 1");
        strLength1 = Double.toString(calculateLength());

        System.out.println("SET THE CO-ORDINATES OF LINE 2");
        strLength2 = Double.toString(calculateLength());

        System.out.println(strLength1.equals(strLength2));

    }

    public void compareTwoLines() {

        // UC3 COMPARISON OF TWO LINES BY USING JAVA COMPARETO METHOD

        System.out.println("SET THE CO-ORDINATES OF LINE 1");
        strLength1 = Double.toString(calculateLength());

        System.out.println("SET THE CO-ORDINATES OF LINE 2");
        strLength2 = Double.toString(calculateLength());

        System.out.println(strLength1.compareTo(strLength2));

    }
}



