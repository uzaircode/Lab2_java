package com.example;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height=0, weight=0;

        double bmi = 0;

        String category="";

        System.out.print("Enter a number of students = ");
        double num = input.nextInt();

        for(int i = 0; i<num; i++)
        {
            System.out.println("Enter weight and height for student " + (i+1) + ": ");
            System.out.print("Weight (lbs) = ");
            weight = input.nextDouble();
            System.out.print("Height (in) = ");
            height = input.nextDouble();

            bmi += ((weight * 703)/(height*height)/num);

        }
        
        System.out.printf("\nAverage BMI for this class is : %.2f" , bmi);

        if(bmi < 18.5)
        {
            category = "Underweight";
        }
        else if(bmi >= 18.5 && bmi < 25)
        {
            category = "Normal";
        }
        else if(bmi >= 25 && bmi < 30)
        {
            category = "Overweight";
        }
        else if(bmi >= 30)
        {
            category = "Obese";
        }

        System.out.println("\nMajority the students of this class are: " + category);



    }
}
