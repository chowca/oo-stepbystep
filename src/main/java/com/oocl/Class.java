package com.oocl;

import java.util.ArrayList;

public class Class {
    private int classNumber;
    private Teacher teacher;
    private String description;
    private Student classLeader;
    private ArrayList<Student> classStudents;

    public Class(int classNumber) {
        this.classNumber = classNumber;
        this.classStudents = new ArrayList<Student>();
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

    public void joinClass(final Student incomingStudent){
        if(!this.classStudents.contains(incomingStudent)) {
            this.teacher.welcome(incomingStudent,this);
            for(Student classStudent : classStudents){
                classStudent.welcome(incomingStudent,this);
            }
            this.classStudents.add(incomingStudent);
            incomingStudent.setClassNumber(classNumber);
        }
    }

    public Student getClassLeader() {
        return classLeader;
    }

    public void setClassLeader(Student classLeader) {
        if(this.classStudents.contains(classLeader)) {
            this.teacher.setLeaderAnnouncement(classLeader,this);
            for(Student classStudent : classStudents){
                classStudent.setLeaderAnnouncement(classLeader,this);
                this.classLeader = classLeader;
            }
        }
    }

    public ArrayList<Student> getClassStudents() {
        return classStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.setTaughtClass(this);
    }
}
