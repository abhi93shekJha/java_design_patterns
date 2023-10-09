package com.designpattern.behavourial.observer;


public class Bitcoin {
    private Double price;

    public Bitcoin(Double price){
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
