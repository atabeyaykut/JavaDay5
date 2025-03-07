package org.example.enums;

public enum Plan {
    BASIC("Basic", 100),
    PREMIUM("Premium", 250),
    VIP("VIP", 500);

    private final String name;
    private final int price;

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }

    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return name + " Plan - Price: ₺" + price;
    }
}
