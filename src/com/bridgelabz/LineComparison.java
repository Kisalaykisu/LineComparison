/*
  Case 1 :-  As a fan of geometry, I want to model a line based on a point
             consisting of (x, y) co-ordinates using the Cartesian system,
             So that I can calculate its length..

*/




package com.bridgelabz;
import java.util.Scanner;   // import scanner

public class LineComparison {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);  // Make scanner obj
        float x1,y1,x2,y2;

        System.out.println("Enter x1 y1 x2 y2: ");
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();  //Float input
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();

        double length = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );    // Mathematical used
        System.out.println(length);

    }
}
