/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */

import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws Exception {
        calculateBMI();
    }
 
    private static void calculateBMI() throws Exception {
        System.out.print("Please enter your weight in pounds: "); //asks user to input weight
        Scanner s = new Scanner(System.in); //scans user input 
        float weight = s.nextFloat();
        System.out.print("Please enter your height in inches: "); //asks user to input height
        float height = s.nextFloat();
         
   
        float bmi = (703*weight)/(height*height); //calculates bmi 
         
        System.out.println("Your BMI is: "+bmi);
        printBMICategory(bmi);
         
    }
     

    private static void printBMICategory(float bmi) {
        if(bmi < 18.5) { //uses if else if statement based on calcula
            System.out.println("You are underweight. Please consult a doctor.");
        }else if (bmi < 25) {
            System.out.println("You are within the ideal weight range.");
        }else if (bmi < 30) {
            System.out.println("You are overweight and should see a doctor.");
        }else {
            System.out.println("You are obese. You should see a doctor.");
        }
    }
}
