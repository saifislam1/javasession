package com.forloop;

import java.util.Scanner;

public class forloop {
    public static void main(String Arg[]){

        System.out.println("Enter the numebr of item");
        Scanner scanner = new Scanner(System.in);
        int quantity= scanner.nextInt();

        double total = 0;

        for(int i=0; i < quantity; i++){
            System.out.println("Enter the cost ");
            double price = scanner.nextDouble();

            total = total + price;

        }
        System.out.println("Your total is $" + total);
    }
}
