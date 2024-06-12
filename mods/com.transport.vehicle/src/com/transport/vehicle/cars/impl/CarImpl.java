package com.transport.vehicle.cars.impl;

import com.transport.vehicle.cars.Car;

public class CarImpl implements Car {
    private int speed;

    public CarImpl(){
        this(10);
    }

    public CarImpl(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
