package com.anastasiia;

public class HouseInTheVillage extends Building {
    @Override
    public String getType() {
        return "living";
    }

    @Override
    public String getName() {
        return "House In The Village";
    }

    @Override
    public int getCountFloor() {
        return 2;
    }

    @Override
    public String getAdditionalSpace() {
        return "plumbing";
    }

    @Override
        public int getRoom() {
            return 4;
    }
}