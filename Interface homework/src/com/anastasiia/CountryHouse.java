package com.anastasiia;

public class CountryHouse extends Building {
    @Override
    public String getType() {
        return "living";
    }

    @Override
    public String getName() {
        return "Country House";
    }

    @Override
    public int getCountFloor() {
        return 4;
    }

    @Override
    public String getAdditionalSpace() {
        return "";

    }

    @Override
    public int getRoom() {
        return 3;
    }
}
