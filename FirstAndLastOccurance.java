package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_string = sc.nextLine();
        char input = sc.next().charAt(0);


        int first = 0;
        int last = 0;
        int flag = 0;

        for(int i=0;i<input_string.length();++i){
            if(flag ==0 && input_string.charAt(i) == input){
                first = i;
                flag = 1;
            }
            if(flag == 1 && input_string.charAt(i) == input){
                last = i;
            }
        }

        System.out.println("First Occurrence :"+first);
        System.out.println("Last Occurrence :"+last);
    }

}
