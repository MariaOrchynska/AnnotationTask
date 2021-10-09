package com.company;

public class Person {
    @Personality(StringValue = "Bob",IntValue = 1)

    private String name;
    private int age;



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Personality(IntValue = 23,StringValue = "Tom")
//    public void showInfo(){
//        Personality.class.getName();
//        System.out.println(name);
//        Personality.class.getAnnotation(S)
    }


