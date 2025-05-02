package org.example.demo8.Model;

public enum Premium {
    Bronze(30, 5), Silver(60, 9), Gold(180, 14);
    private final int day;
    private final int price;

    public int getDay() {return day;}

    public int getPrice() {return price;}

    Premium(int day, int price) {
        this.day = day;
        this.price = price;
    }
}
