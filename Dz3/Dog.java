package com.anastasiia;

public class Dog extends Animal {
    public Dog(int age, int weight, String color) {
        this.setAge(age);
        this.setWeight(weight);
        this.setColor(color);
    }
        @Override
        public String toString () {
            return "My dog " + super.toString();
        }
    }




