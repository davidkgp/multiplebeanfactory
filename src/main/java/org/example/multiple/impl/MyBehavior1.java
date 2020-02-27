package org.example.multiple.impl;


import org.example.multiple.MyBehavior;

public class MyBehavior1 implements MyBehavior {

    private String name;

    public MyBehavior1(String name) {
        this.name = name;
    }

    @Override
    public void doingMajorWork() {

        System.err.println(String.format("In class MyBehavior1 %s", name));

    }
}
