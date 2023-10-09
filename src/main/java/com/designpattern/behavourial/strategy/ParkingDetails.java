package com.designpattern.behavourial.strategy;

public class ParkingDetails {

    Double parkingPrice;
    Double parkingTime;
    ParkingSpotAssigningStrategy parkingSpotAssigningStrategy;

    public void setParkingSpotAssigningStrategy(ParkingSpotAssigningStrategy parkingSpotAssigningStrategy) {
        this.parkingSpotAssigningStrategy = parkingSpotAssigningStrategy;
    }

    void assignParkingSpot(Double entryPoint){
        this.parkingSpotAssigningStrategy.bookParkingSpot(entryPoint);
    }

}
