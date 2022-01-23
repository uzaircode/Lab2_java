package com.example;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height=0, weight=0;

        double bmi;

        String category="";

        System.out.print("Enter a number of students = ");
        double num = input.nextInt();

        for(int i = 0; i<num; i++)
        {
            System.out.println("Enter weight and height for student " + ++i + ": ");
            System.out.print("Weight (lbs) = ");
            weight = input.nextDouble();
            System.out.print("Height (in) = ");
            height = input.nextDouble();
        }

        bmi = (weight * 703)/(height*height);

        System.out.println("Average BMI for this class is : " + bmi );

        if(bmi < 18.5)
        {
            category = "Underweight";
        }

        System.out.println("Majority the students of this class are: ");



    }
}
