package com.anastasiia;

public class Snake extends Animal {
    public Snake(int age, int weight, String color) {
        this.setAge(age);
        this.setWeight(weight);
        this.setColor(color);
    }

    @Override
    public String toString() {
        return "My snake " + super.toString();
    }
}