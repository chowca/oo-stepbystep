package com.oocl;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + " Coding for the glory of OOCL";
    }
}
