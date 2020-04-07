package com.oocl;

public class Student extends Person{
    private int classNumber;
    public Student(String name, int age) {
        super(name, age);
        this.classNumber = 0;
    }

    public Student(String name, int age, int classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNo) {
        this.classNumber = classNo;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a student of class " + getClassNumber() + ". Coding for the glory of OOCL.";
    }
}
