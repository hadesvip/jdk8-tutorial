package com.bean;

/**
 * Created by wangyong on 3/30/17.
 */
public class Apple {

    private int weight;

    private String color;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }


    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }


    public static String appleFancyFormatter(Apple apple) {
        return apple.getWeight() > 100 ? "heavy" : "light";
    }

    public static String appleSimpleFormatter(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }


    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
