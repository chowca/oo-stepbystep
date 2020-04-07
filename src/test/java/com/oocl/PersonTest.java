package com.oocl;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void should_get_person_introduction() {
        String name = "Tom";
        int age = 21;
        Person person = new Person(name,age);
        assertThat(person.introduce(), is("My name is Tom. I am 21 years old."));
    }
}