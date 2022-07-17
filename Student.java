package com.ultralessen.javaPlayG1;

public class Student {
    String name;
    public Student(){
        this.name = "Unknown";
        System.out.println(this.name);
    }
    public Student(String input_name){
        this.name = input_name;
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Student o1 = new Student("Rajat Srivastava");
        Student o2 = new Student();
    }
}
