package com.company;

public class Dog {
    private String name;
    private String color;
    private int year;
    private int damage;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.matches("[A-Za-z0-9]*")) {
            this.name = name;
        }
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color.matches("[A-Za-z0-9]*")) {
            this.color = color;
        }
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year < 0) {
        } else {
            this.year = year;
        }
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        if (damage < 0) {
        } else {
            this.damage = damage;
        }
    }
}

