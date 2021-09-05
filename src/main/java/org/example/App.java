package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the ceiling: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the ceiling: ");
        int width = scanner.nextInt();
        int area = length * width;
        double convertGallon = area / 350.0;
        int requiredGallon = (int) Math.ceil(convertGallon);
        System.out.println("You will need to purchase " + requiredGallon + " gallons of paint to cover " + area + " square feet.");
    }
}
