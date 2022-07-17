package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class IsLowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Character entered is in Lowercase");
        }
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Character Entered is in UpperCase");


        }
    }
}
