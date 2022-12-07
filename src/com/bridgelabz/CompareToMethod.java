package com.bridgelabz;

import java.util.Scanner;

public class CompareToMethod {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter four points of first line: ");
        int x1 = s1.nextInt();
        int y1 = s1.nextInt();
        int x2 = s1.nextInt();
        int y2 = s1.nextInt();

        System.out.println("Enter four points of second line: ");
        int a1 = s1.nextInt();
        int b1 = s1.nextInt();
        int a2 = s1.nextInt();
        int b2 = s1.nextInt();

        double lenght1 =  Math.sqrt(((x2 - x1)*(x2- x1)) + ((y2 - y1)*(y2-y1)));
        System.out.println("Line1: " + lenght1);
       double lenght2 =  Math.sqrt(((a2 - a1)*(a2- a1)) + ((b2 - b1)*(b2-b1)));
        System.out.println("Line2: " + lenght2);

        Double line1 = lenght1;
        Double line2 = lenght2;
        int result = line1.compareTo(line2);

        if(result== -1){
            System.out.println("Line 2 is greater");
        } else if (result == 0) {
            System.out.println("Both lines are equal");
        }else{
            System.out.println("Line 1 is greater");
        }


    }
}





