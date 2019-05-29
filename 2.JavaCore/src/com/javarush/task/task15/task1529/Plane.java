package com.javarush.task.task15.task1529;

public class Plane implements CanFly {

    private int passengerAmount;

    public Plane(int passengerAmount) {
        this.passengerAmount = passengerAmount;
    }

    @Override
    public void fly() {
    }
}
