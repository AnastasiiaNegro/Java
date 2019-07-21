package com.anastasiia;

public abstract class Building implements IBuilding {


    @Override
    public String toString() {
        return "   " +getName()+"   " +getType() +"   "+"count floor:"+" " +getCountFloor()+"   "+getAdditionalSpace()+"   "+ "room:" + " "+ getRoom();
    }
}



