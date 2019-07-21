package com.anastasiia;

public class Shed extends Building {
    @Override
    public String getType() {
        return "no living";
    }

    @Override
    public String getName() {
        return "Shed";
    }

    @Override
    public int getCountFloor() {
        return 1;
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