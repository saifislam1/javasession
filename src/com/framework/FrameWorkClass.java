package com.framework;

import java.util.Scanner;

public class FrameWorkClass {

    public static void main (String Arg[]){
            System.out.println("How many hours");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //Get the hourly rate
        System.out.println("Pay rate");
        double rate = scanner.nextDouble();

        //Multiply hours

        double grossness = hours * rate;
                System.out.println("Employees gross pay is $" +grossness);


    }
}
