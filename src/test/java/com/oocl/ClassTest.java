package com.oocl;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ClassTest {
    @Test
    public void should_get_class_detail() {
        Class klass = new Class(2);
        Teacher teacher = new Teacher("Woody", 30);
        Student tom = new Student("Tom",18);
        Student jim = new Student("Jim",18);

        klass.setTeacher(teacher);
        klass.joinClass(tom);
        klass.joinClass(jim);
        klass.setClassLeader(tom);
        assertThat(String.valueOf(klass.getTeacher().getTaughtClasses().get(0).getClassNumber()), is("2"));
        assertThat(klass.getTeacher().introduce(), is("My name is Woody. I am 30 years old. Teaching for the future of world."));
        assertThat(klass.getClassStudents().get(0).introduce(), is("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL."));
        assertThat(klass.getClassStudents().get(1).introduce(), is("My name is Jim. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL."));
        assertThat(klass.getClassLeader().introduce(), is("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL."));
    }

    @Test void should_welcome_by_teacher(){
        Class klass = new Class(2);
        Teacher teacher = new Teacher("Woody", 30);
        Student tom = new Student("Tom",18);
        Student jim = new Student("Jim",18);

        klass.setTeacher(teacher);
        klass.joinClass(tom);
        klass.joinClass(jim);
        klass.setClassLeader(tom);
        assertThat(teacher.getWelcomeMsgs().get(0), is("My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2."));
    }

    @Test void should_announce_leader_by_teacher(){
        Class klass = new Class(2);
        Teacher teacher = new Teacher("Woody", 30);
        Student tom = new Student("Tom",18);
        Student jim = new Student("Jim",18);

        klass.setTeacher(teacher);
        klass.joinClass(tom);
        klass.joinClass(jim);
        klass.setClassLeader(tom);
        assertThat(teacher.getLeaderAnnouncement(), is("My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2."));
    }

    @Test void should_welcome_by_other_students(){
        Class klass = new Class(2);
        Teacher teacher = new Teacher("Woody", 30);
        Student tom = new Student("Tom",18);
        Student jim = new Student("Jim",18);

        klass.setTeacher(teacher);
        klass.joinClass(tom);
        klass.joinClass(jim);
        klass.setClassLeader(tom);
        assertThat(tom.getWelcomeMsgs().get(0), is("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2."));
    }

    @Test void should_announce_leader_by_other_students(){
        Class klass = new Class(2);
        Teacher teacher = new Teacher("Woody", 30);
        Student tom = new Student("Tom",18);
        Student jim = new Student("Jim",18);

        klass.setTeacher(teacher);
        klass.joinClass(tom);
        klass.joinClass(jim);
        klass.setClassLeader(jim);
        assertThat(tom.getLeaderAnnouncement(), is("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Jim is the leader of Class 2."));
    }
}