package com.bridgelabz;

import java.util.Objects;
import java.util.Scanner;

public class Compare2Lines {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter four points of first line: ");
        float x1 = s1.nextInt();
        float y1 = s1.nextInt();
        float x2 = s1.nextInt();
        float y2 = s1.nextInt();

        System.out.println("Enter four points of second line: ");
        float a1 = s1.nextInt();
        float b1 = s1.nextInt();
        float a2 = s1.nextInt();
        float b2 = s1.nextInt();

        double lenght1 = Math.sqrt(((x2 - x1)*(x2- x1)) + ((y2 - y1)*(y2-y1)));
        System.out.println("Line1: " + lenght1);
        double lenght2 = Math.sqrt(((a2 - a1)*(a2- a1)) + ((b2 - b1)*(b2-b1)));
        System.out.println("Line2: " + lenght2);
        boolean result = Objects.equals(lenght1, lenght2);
        if(result == true){
            System.out.println("The 2 lines are equal");
        }else{
            System.out.println("The 2 lines are not equal");
        }

    }
}

