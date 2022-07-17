package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class LargestSmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<arraySize;i++){
            array[i] = sc.nextInt();
            largest = Math.max(largest, array[i]);
            smallest = Math.min(smallest, array[i]);
        }
        System.out.println("Largest Number: "+largest);
        System.out.println("Smallest Number: "+smallest);
    }
}
