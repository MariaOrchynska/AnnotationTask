package com.company;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        showName(person);
        System.out.println(person.getName());
        System.out.println(person.getAge());


    }


        private static void showName(Person person) throws Exception {
        Field[] fields = Person.class.getDeclaredFields();
        for (Field field : fields) {
           Personality personality= field.getAnnotation(Personality.class);
           field.setAccessible(true);
           field.set(person, personality.StringValue());
            field.setInt(person, personality.IntValue());

        }

    }
}