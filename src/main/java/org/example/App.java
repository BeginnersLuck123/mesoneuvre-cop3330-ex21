package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of the month: ");
        int month = input.nextInt();//Input
        String nameOfMonth = "";
        //IF statements to match number with a month
        if(month == 1)
        {
            nameOfMonth="January";
        }
        if(month == 2)
        {
            nameOfMonth="February";
        }
        if(month == 3)
        {
         nameOfMonth="March";
        }
        if(month == 4)
        {
            nameOfMonth="April";
        }
        if(month == 5)
        {
            nameOfMonth="May";
        }
        if(month == 6)
        {
            nameOfMonth="June";
        }
        if(month == 7)
        {
         nameOfMonth="July";
        }
        if(month == 8)
        {
            nameOfMonth="August";
        }
        if(month == 9)
        {
            nameOfMonth="September";
        }
        if(month == 10)
        {
            nameOfMonth="October";
        }
        if(month == 11)
        {
            nameOfMonth="November";
        }
        if(month == 12)
        {
            nameOfMonth="December";
        }
        if(month > 12 || month <= 0)
        {
            nameOfMonth="ERROR: PLEASE GIVE VALID NUMBER";
        }
        System.out.println("The name of the month is " + nameOfMonth + ".");//Output


    }
}
