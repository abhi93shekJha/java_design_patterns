package com.designpattern.structural.flyweight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HumanPlayer {

    // Extrinsic states - that will change by client
    Double rating;
    double health;
    boolean isPlaying;

    PlayerProfile profile;
}
