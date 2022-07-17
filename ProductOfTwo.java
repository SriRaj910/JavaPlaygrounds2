package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        double product= new ProductOfTwo().productCalculator(n1,n2);
        System.out.println("The Product of the given numbers is : "+ product);
    }
    public double productCalculator(double a,double b){
        return a*b;
    }
}
