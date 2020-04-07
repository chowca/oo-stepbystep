package com.oocl;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void should_get_student_introduction() {
        String name = "Tom";
        int age = 18;
        int classNumber = 2;
        Student student = new Student(name,age,classNumber);
        assertThat(student.introduce(), is("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL."));
    }
}