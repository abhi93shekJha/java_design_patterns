package com.designpattern.creational.prototypewithregistory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        TrainingData plotTrainingData1 = new PlotTrainingData();
        TrainingData plotTrainingData2 = new PlotTrainingData();

        TrainingDataRegistory registory = new TrainingDataRegistory();
        registory.register(plotTrainingData1);
        registory.register(plotTrainingData2);

        List<PlotTrainingData> dataList = new ArrayList<>();
        for(int i=0; i<5; i++){
            TrainingData object = registory.getObject(plotTrainingData1.getType());
            dataList.add(((PlotTrainingData) object).cloneObject());
        }

    }
}
