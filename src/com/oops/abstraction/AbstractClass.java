package com.oops.abstraction;

abstract class Person{

    String name;
    int age;
    int rollno;
    Person(String name, int age, int rollno){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
    }
}
class Student extends Person {
    static String address;

    Student(String address, String name, int age, int rollno) {
        super(name, age, rollno);
    }

    void show() {
        System.out.println(" Name = " + name + "\n Address = " + address + "\n Age = " + age + " \n Rollno = " + rollno);
    }
}
public class AbstractClass{
    public static void main(String[] args){
        Student s=new Student("Koilsa", "Hashim", 18, 12);
        s.show();
    }
}
