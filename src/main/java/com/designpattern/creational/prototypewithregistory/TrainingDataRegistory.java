package com.designpattern.creational.prototypewithregistory;

import java.util.HashMap;
import java.util.Map;

public class TrainingDataRegistory{
    Map<TrainingDataType, TrainingData> trainingDataMap = new HashMap<>();

    public void register(TrainingData object) {
        trainingDataMap.put(object.getType(), object);
    }


    public void deRegister(TrainingData object) {
        trainingDataMap.remove(object.getType());
    }


    public TrainingData getObject(TrainingDataType type) {
        return trainingDataMap.get(type);
    }

}
