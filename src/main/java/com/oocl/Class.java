package com.oocl;

import java.util.ArrayList;

public class Class {
    private int classNumber;
    private String description;
    private Student classLeader;
    private ArrayList<Student> classStudents;

    public Class(int classNumber, String description) {
        this.classNumber = classNumber;
        this.description = description;
    }

    public Class(int classNumber, String description, Student classLeader) {
        this.classNumber = classNumber;
        this.description = description;
        this.classLeader = classLeader;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void joinClass(Student incomingStudent){
        if(!this.classStudents.contains(incomingStudent)) {
            this.classStudents.add(incomingStudent);
            incomingStudent.setClassNumber(this.getClassNumber());
        }
    }

    public void quitClass(Student quitingStudent){
        if(this.classStudents.contains(quitingStudent)) {
            this.classStudents.remove(quitingStudent);
            quitingStudent.setClassNumber(0);
        }
    }

    public Student getClassStudnetInfo(String name) {

            for (Student student : this.classStudents) {
                if (student.getName().equals(name)) {
                    return student;
                }
            }
            return null;
    }

    public Student getClassLeader() {
        return classLeader;
    }

    public void setClassLeader(Student classLeader) {
        this.classLeader = classLeader;
    }
}
