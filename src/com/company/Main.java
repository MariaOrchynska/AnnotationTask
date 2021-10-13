package com.company;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args)  {
       Person person= new Person();
        setName(person);
        System.out.println(person.getName());

    }
    @SneakyThrows
    public static void setName(Person person){
        Field [] fields =person.getClass().getDeclaredFields();
        for(Field field: fields){
            Personality personality= field.getAnnotation(Personality.class );
            field.setAccessible(true);
            field.set(person, person.name);
        }

    }



    }

