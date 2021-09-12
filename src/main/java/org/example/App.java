/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int int1, int2;

        // Prompt user as strings
        System.out.println( "What is the first number?" );
        String num1 = scan.nextLine();

        System.out.println( "What is the second number?" );
        String num2 = scan.nextLine();

        // Turn strings into integers before calculations
        int1 = Integer.parseInt(num1);
        int2 = Integer.parseInt(num2);
        
        // Single output statement with \n for line breaks
        System.out.println( int1+" + "+int2+" = " + (int1 + int2)+ '\n' +int1+" - "+int2+" = " + (int1 - int2)+ '\n' +int1+" * "+int2+" = " + (int1 * int2)+ '\n' +int1+" / "+int2+" = " + (int1 / int2) );
    }
}
