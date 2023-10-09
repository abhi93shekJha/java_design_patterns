package com.designpattern.behavourial.strategy;

public class EndToFirstParkingSpotAssigningStrategy implements ParkingSpotAssigningStrategy {
    @Override
    public void bookParkingSpot(Double entryPoint) {
        System.out.println("Parking spot should be at " + (entryPoint+10.0));
    }
}
