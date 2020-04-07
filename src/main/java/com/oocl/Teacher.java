package com.oocl;

import java.util.ArrayList;

public class Teacher extends Person{
    private ArrayList<Class> taughtClasses;
    private ArrayList<String> welcomeMsgs;
    private String leaderAnnouncement;
    public Teacher(String name, int age) {
        super(name, age);
        taughtClasses = new ArrayList<Class>();
        welcomeMsgs = new ArrayList<String>();
    }

    public ArrayList<Class> getTaughtClasses() {
        return taughtClasses;
    }

    public void setTaughtClass(Class taughtClass){
        if(taughtClasses.size() < 5){
            taughtClasses.add(taughtClass);
        }
    }

    @Override
    public String introduce() {
        return String.format("%s Teaching for the future of world.",super.introduce());
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
