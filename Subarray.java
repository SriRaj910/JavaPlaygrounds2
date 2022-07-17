package com.ultralessen.javaPlayG1;


import java.util.Arrays;

public class Subarray {
    public static void main(String[] args) {
        int[] a = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int[] subA = Arrays.copyOfRange(a, 3, 8);

            System.out.println(Arrays.toString(subA));

        }
    }

