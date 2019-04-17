package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String text;
        int textIndex;

        System.out.print("Enter a word: ");
        text = keyboard.next();
        System.out.print("Enter a number as an index: ");
        textIndex = keyboard.nextInt();


        System.out.println("The length of " + text + " is: " + text.length());

        if (textIndex > text.length())
            System.out.println("Index is larger than length.");
        else
            System.out.println("The substring from 0 to " + textIndex + " is: " + text.substring(0, textIndex));
    }
}
