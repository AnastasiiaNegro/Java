package com.anastasiia;

public class Cat extends Animal {
    public Cat(int age, int weight, String color) {
        this.setAge(age);
        this.setWeight(weight);
        this.setColor(color);
    }

    @Override
    public String toString() {
        return "My cat " + super.toString();
    }

    public String go() {
        return "Jump";
    }

    @Override
    public String eat() {
        return " Cheese";
    }
}



