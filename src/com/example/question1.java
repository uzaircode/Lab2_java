package com.example;

import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String status = null;

        String choice = "";

        do {
            System.out.print("Enter the wind speed: ");
            double speed = input.nextInt();


            if (speed <= 38) {
                status = "Windy";
            }
            else if (speed >= 39 && speed <= 54) {
                status = "Gale";
            }
            else if (speed >= 55) {
                status = "Storm";
            }

            System.out.println("It is " + status);


            System.out.print("Do you want to continue? ");
            choice = input.next();

        } while (choice.equals("Yes"));
    }
}
