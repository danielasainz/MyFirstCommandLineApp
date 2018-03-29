package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Welcome, " + name);
        System.out.print("What is your favorite color? ");
        String color = keyboard.nextLine();
        System.out.println("Your favorite color is " + color);
        if (color.equalsIgnoreCase("red")) {
            System.out.println("My favorite color is also " + color);
        }else{
            System.out.println("My favorite color is green");

        }
    }
}
