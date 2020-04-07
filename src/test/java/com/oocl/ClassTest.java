package com.oocl;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ClassTest {
    @Test
    public void should_get_class_detail() {
        Student student_1 = new Student("Tom",18);
        Student student_2 = new Student("Amy",17);
        Class teachingClass_1 = new Class(1,"Class 1");
        Class teachingClass_2 = new Class(2,"Class 2");
        teachingClass_1.joinClass(student_1);
        teachingClass_2.joinClass(student_2);
        assertThat(teachingClass_1.getClassStudnetInfo("Tom").introduce(), is("My name is Tom. I am 18 years old. I am a student of class 1. Coding for the glory of OOCL."));
        //assertThat(teachingClass_2.introduce(), is("My name is Amy. I am 17 years old. I am a student of class 1. Coding for the glory of OOCL."));
        //assertThat(teachingClass_2.introduce(), is("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL."));
    }
}