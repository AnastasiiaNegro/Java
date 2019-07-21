package com.anastasiia;

public class Magazine extends Building {
    @Override
    public String getType() {
        return "no living";
    }

    @Override
    public String getName() {
        return "Magazine";
    }

    @Override
    public int getCountFloor() {
        return 1;
    }

    @Override
    public String getAdditionalSpace() {
        return "plumbing";
    }

    @Override
    public int getRoom() {
        return 0;
    }
}
