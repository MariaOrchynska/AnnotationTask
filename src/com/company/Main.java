package com.company;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args)  {
       Person person= new Person();
        setName(person);
        System.out.println(person.getLastName());

    }
    @SneakyThrows
    public static void setName(Person person){
        Field [] fields =person.getClass().getDeclaredFields();
        for(Field field: fields){
            Personality personality=person.getClass().getAnnotation(Personality.class);
            field.setAccessible(true);
            field.set(person, personality.StringValue());
        }

    }



    }

