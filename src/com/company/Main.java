package com.company;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        showName(person);
        System.out.println(person.getName());


    }

        private static void showName(Person person) throws Exception {
        Field[] fields = person.getClass().getDeclaredFields();
        for (Field field : fields) {
           Personality annotation= field.getAnnotation(Personality.class);
           field.setAccessible(true);
           field.set(person, annotation.StringValue());

        }

    }
}