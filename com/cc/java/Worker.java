package com.cc.java;

public class Worker extends HoneyBee{

    @Override
    public String doYourJob() {
        return "I'm a worker bee, work work";
    }

    @Override
    public String fly() {
        return "I fly from flower to flower!";
    }

}
