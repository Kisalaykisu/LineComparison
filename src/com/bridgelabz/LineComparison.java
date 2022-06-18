/*
   Case 3:-  Calculation of length of two lines: line1 Points (x1, y1) and (x2, y2) and
             line2 Points (x4, y4) and (x4, y4).

 */




package com.bridgelabz;
import java.util.Scanner;   // import scanner

import static java.lang.Double.compare;
public class LineComparison {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);  //  Make scanner obj
        float x1,y1,x2,y2;

        System.out.println("Enter x1 y1 x2 y2 of line one: ");
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();  // float input
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();
        double l1 = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );   // Mathematical formula

        System.out.println("Enter x1 y1 x2 y2 of line two: ");
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();
        double l2 = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );

        int x = compare(l1, l2);
        System.out.println(x);

        if (x==0){
            System.out.println("Both the lines are equal in length. ");
        }else if (x<0)
            System.out.println("line one is smaller than line two. ");
        else
            System.out.println("line one is larger than line two. ");
    }
}

