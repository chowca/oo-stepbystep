package com.oocl;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TeacherTest {
    @Test
    public void should_get_teacher_introduction() {
        String name = "Tom";
        int age = 18;
        Teacher teacher = new Teacher(name,age);
        assertThat(teacher.introduce(), is("My name is Tom. I am 18 years old. Teaching for the future of world."));
    }
}