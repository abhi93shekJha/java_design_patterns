package com.designpattern.creational.prototypewithregistory;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class PlotTrainingData extends TrainingData implements Cloneable {

    Double plot_length, plot_breadth;
    String plot_location;
    PlotFacing plotFacing;

    public PlotTrainingData(){
        // calling API to get data
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        this.plot_breadth = 10.0;
        this.plot_length = 10.0;
        this.plot_location = "Kormangala";
        this.plotFacing = PlotFacing.SOUTH;
        System.out.println("Training data created");
    }

    public TrainingDataType getType(){
        return TrainingDataType.PLOT;
    }

    @Override
    public PlotTrainingData cloneObject() {
        System.out.println("Creating clone data created");
        return new PlotTrainingData(this.plot_length, this.plot_breadth, this.plot_location, this.plotFacing);
    }
}
