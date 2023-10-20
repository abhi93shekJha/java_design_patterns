package com.designpattern.structural.flyweight;

public class Client {

    public static void main(String[] args){
        byte[] image = {12, 42, 13, -23}; //range b/w (-128 - 127)
        PlayerProfile profile1 = new PlayerProfile(image, "Abhishek", 30);
        PlayerProfile profile2 = new PlayerProfile(image, "Jha", 29);

        PlayerProfileRegistory registory = new PlayerProfileRegistory();
        registory.registerPlayer(profile1);

        HumanPlayer humanPlayer1 = new HumanPlayer(5.0, 23.4, true, registory.getPlayer(PlayerType.HUMAN));
        HumanPlayer humanPlayer2 = new HumanPlayer(10.0, 73.4, true, registory.getPlayer(PlayerType.HUMAN));

    }
}
