package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class SumProductArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        int sum = 0;
        double product = 1;

        for(int i=0;i<arraySize;i++){
            array[i] = sc.nextInt();
            sum += array[i];
            product *= array[i];
        }

        System.out.println("Sum of the Array: "+sum);
        System.out.println("Product of the array: "+product);
    }
}
