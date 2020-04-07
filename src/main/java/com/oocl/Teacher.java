package com.oocl;

public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + " Teaching for the future of world.";
    }
}
