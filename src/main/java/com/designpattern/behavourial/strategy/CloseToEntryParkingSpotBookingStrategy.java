package com.designpattern.behavourial.strategy;

public class CloseToEntryParkingSpotBookingStrategy implements ParkingSpotAssigningStrategy {


    @Override
    public void bookParkingSpot(Double entryPoint) {
        System.out.println("Parking spot should be at " + (entryPoint+100.0));
    }
}
