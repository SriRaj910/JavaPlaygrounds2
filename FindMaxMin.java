package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int a = ss.nextInt();
        int b = ss.nextInt();
        int c = ss.nextInt();
        FindMaxMin ob = new FindMaxMin();

        System.out.println("Maximum Number = " + ob.findMax(a,b,c));
        System.out.println("Minimum Number = " + ob.findMin(a,b,c));
    }

    public int findMax(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
    public int findMin(int a, int b, int c){
        return Math.min(a,Math.min(b,c));
    }
}
