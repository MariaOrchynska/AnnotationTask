package com.company;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person();
        Field[] fields = Person.class.getDeclaredFields();
        for (Field field : fields) {
           Personality personality= field.getAnnotation(Personality.class);
           field.setAccessible(true);
           field.set(person, personality.StringValue());
        }
        System.out.println(person.getName());
    }
}