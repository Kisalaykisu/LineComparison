/* Q.4 ) Use Java Object Oriented Programming Concepts of Line and Point as well as equals and
      compareTo methods. -
      Using Java compareTo method to compare 2 Lengths is preferable.*/
package com.bridgelabz;

import java.util.Scanner;  // import scanner
import static java.lang.Double.compare;   // method compares the two specified double value

public class LineComparison{
    public static void main(String[] args){  // Entry Point of Program

        lineComparison();

    }
    public static void lineComparison(){
        Scanner scanner = new Scanner(System.in);  // Make Scanner Obj
        float x1,y1,x2,y2;

        System.out.println("Enter x1 y1 x2 y2 of line one: ");
        x1 = scanner.nextFloat();  // Input float
        y1 = scanner.nextFloat();  // Input float
        x2 = scanner.nextFloat();  // Input float
        y2 = scanner.nextFloat();  // Input float
        double l1 = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );  //Mathematical Formula

        System.out.println("Enter x1 y1 x2 y2 of line two: ");
        x1 = scanner.nextFloat();  // Input float
        y1 = scanner.nextFloat();  // Input float
        x2 = scanner.nextFloat();  // Input float
        y2 = scanner.nextFloat();
        double l2 = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );

        int x = compare(l1, l2);  // Compare the two lines
        System.out.println(x);

        if (x==0){
            System.out.println("Both the lines are equal in length. ");
        }else if (x<0)
            System.out.println("line one is smaller than line two. ");
        else
            System.out.println("line one is larger than line two. ");
    }
}




