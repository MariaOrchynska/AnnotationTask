package com.company;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class Main {
    @SneakyThrows
    public static void main(String[] args)  {
        Person person = new Person();
        showName(person);
        System.out.println(person.getName());


    }
        private static void showName(Person person) throws Exception {
        Field[] fields = person.getClass().getDeclaredFields();
        for (Field field : fields) {
           Personality personality= field.getAnnotation(Personality.class);
           field.setAccessible(true);
           field.set(person, personality.StringValue());

        }

    }
}