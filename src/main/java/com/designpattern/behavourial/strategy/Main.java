package com.designpattern.behavourial.strategy;

public class Main {

    public static void main(String[] args) {
        ParkingDetails parkingDetails = new ParkingDetails();
        EndToFirstParkingSpotAssigningStrategy s1 = new EndToFirstParkingSpotAssigningStrategy();
//        parkingDetails.setParkingSpotAssigningStrategy(new EndToFirstParkingSpotAssigningStrategy());
        s1.bookParkingSpot(100.0);

        parkingDetails.setParkingSpotAssigningStrategy(new CloseToEntryParkingSpotBookingStrategy());
        parkingDetails.assignParkingSpot(80.0);
    }
}
