package com.cc.java;

public class Drone extends HoneyBee{

    @Override
    public String doYourJob(){
        return "I'm a drone, I bang our Queen!";
    }

    @Override
    public String fly() {
        return "I fly to bang the Queen!"; 
    }
 

}
