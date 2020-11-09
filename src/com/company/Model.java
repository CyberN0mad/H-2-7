package com.company;

public class Model {
    String car;
    String color;

    public Model(String car, String color) {
        this.car = car;
        this.color = color;
    }

    public String getCar() {
        return car;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Model[" +
                "Your result is: Car='" + car + '\'' +
                ", color='" + color + '\'' +
                ']';
    }
}
