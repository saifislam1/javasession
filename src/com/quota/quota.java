package com.quota;

import java.util.Scanner;

public class quota {

    public static void main(String Arg[]){
        int quota = 10;
        System.out.println("Enter the number of sales");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales>= quota){
            System.out.println("Congrats you met yor goal");
        }
        else{
            int salesShort = quota-sales;
            System.out.println("You did not make your target,you were "+ salesShort+" Sales Short");
        }

    }
}
