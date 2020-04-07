package com.oocl;

import java.util.ArrayList;

public class Student extends Person{
    private int classNumber;
    private ArrayList<String> welcomeMsgs;
    private String leaderAnnouncement;
    public Student(String name, int age) {
        super(name, age);
        welcomeMsgs = new ArrayList<String>();
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNo) {
        this.classNumber = classNo;
    }

    @Override
    public String introduce() {
        return String.format("%s I am a student of class %s. Coding for the glory of OOCL.",super.introduce(), getClassNumber());
    }

    public void welcome(Student student, Class klass){
        String welcomeMsg = String.format("%s Welcome %s join Class %d.",introduce(),student.getName(),klass.getClassNumber());
        welcomeMsgs.add(welcomeMsg);
    }

    public ArrayList<String> getWelcomeMsgs(){
        return welcomeMsgs;
    }

    public void setLeaderAnnouncement(Student student, Class klass){
        leaderAnnouncement = String.format("%s %s is the leader of Class %d.",introduce(),student.getName(),klass.getClassNumber());
    }

    public String getLeaderAnnouncement() {
        return leaderAnnouncement;
    }
}
