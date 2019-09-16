package com.company;

import java.util.Scanner;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) { //two-}
        this.name = name;
        this.age = age;
    }


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



    @Override
    public String toString(){
        String temp = "";
        temp = "This person's name is " + getName()
                + " and their age is " + getAge();
        return temp;
    }
}
