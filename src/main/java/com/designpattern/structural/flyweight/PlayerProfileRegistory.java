package com.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlayerProfileRegistory {

    Map<PlayerType, PlayerProfile> map = new HashMap<>();
    public void registerPlayer(PlayerProfile playerProfile){
        if (!map.containsKey(playerProfile.getType()))
            map.put(playerProfile.getType(), playerProfile);
    }

    public PlayerProfile getPlayer(PlayerType type){
        return map.get(type);
    }
}
