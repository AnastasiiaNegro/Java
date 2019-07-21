package com.anastasiia;

public class CityHouse extends Building {
    @Override
    public String getType() {
        return "living";
    }

    @Override
    public String getName() {
        return "City House";
    }

    @Override
    public int getCountFloor() {
        return 0;
    }

    @Override
    public String getAdditionalSpace() {
        return "plumbing" + "  " + "toilet" + "   " + "balcony";

    }

    @Override
    public int getRoom() {
        return 524;
    }
}