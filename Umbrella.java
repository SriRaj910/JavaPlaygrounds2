package com.ultralessen.javaPlayG1;

public class Umbrella {
    public static void main(String[] args) {
        String s="Umbrella";
        char ch='e';
        boolean f=false;
        for(int i=0;i<s.length();i++)
        {
            if(ch==s.charAt(i)){

                f=true;
                break;
            }
            else {
               continue;
            }
        }
        System.out.println(f?"Letter is present":"letter is not Present");

    }
}
