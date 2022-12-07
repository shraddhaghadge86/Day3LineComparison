package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter four points ");
        float x1 = s1.nextInt();
        float y1 = s1.nextInt();
        float x2 = s1.nextInt();
        float y2 = s1.nextInt();

        float lenght = (float) Math.sqrt(((x2 - x1)*(x2- x1)) + ((y2 - y1)*(y2-y1)));

        System.out.println("The lenght of the line is: " + lenght);

    }
}
