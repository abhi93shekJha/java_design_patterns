package com.designpattern.behavourial.observer;
import java.util.ArrayList;
import java.util.List;


public abstract class Observable {

    List<Observer> consumerList = new ArrayList<>();
    public void publish(Bitcoin bitcoin){
        for (Observer observer:consumerList)
            observer.notifyChange(bitcoin.getPrice());
    }

    public void register(Observer consumer){
        consumerList.add(consumer);
    }

    public void deregister(Observer consumer){
        consumerList.remove(consumer);
    }


}
