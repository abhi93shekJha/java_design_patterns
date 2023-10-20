package com.designpattern.structural.flyweight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlayerProfile {

    //Intrinsic states
    byte[] images = new byte[1000];
    String name;
    int age;

    public PlayerType getType(){
        return PlayerType.HUMAN;
    }
}
