package org.example.multiple.impl;


import org.example.multiple.MyBehavior;

public class MyBehavior2 implements MyBehavior {

    private int value;

    public MyBehavior2(int value) {
        this.value = value;
    }

    @Override
    public void doingMajorWork() {

        System.err.println(String.format("In class MyBehavior2 %s", value));

    }
}
