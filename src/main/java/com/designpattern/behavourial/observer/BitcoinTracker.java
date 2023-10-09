package com.designpattern.behavourial.observer;


public class BitcoinTracker extends Observable implements BitcoinManager{
    private Bitcoin bitcoin;

    public BitcoinTracker(Double price){
        bitcoin = new Bitcoin(price);
    }
    public void setPrice(Double newPrice){
        // logic related to setting price
        Double oldPrice = bitcoin.getPrice();
        bitcoin.setPrice(newPrice);

        // notify to consumers here, using Publisher
        if(newPrice-oldPrice>=5) {
            publish(bitcoin);
        }
    }

    @Override
    public Double getPrice() {
        return bitcoin.getPrice();
    }
}
