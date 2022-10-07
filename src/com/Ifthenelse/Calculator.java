package com.Ifthenelse;

import java.util.Scanner;

public class Calculator {
    public static void main(String Arg[]) {

        int salary = 1000;
        int bonus = 250;
        System.out.println("Enter Salary");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > 10) {
            salary = salary + bonus;

        }

        System.out.println("Salary is $"+salary);
    }


}


