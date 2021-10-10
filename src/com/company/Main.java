package com.company;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class Main {
    @SneakyThrows
    public static void main(String[] args)  {
        Personality person = Person.class.getAnnotation(Personality.class);
        System.out.println("Users name is : " + person.StringValue() + " and age is: "+ person.IntValue());

    }


        }

