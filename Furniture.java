package com.company;

public abstract class Furniture {
    int price;
    String color;
    int quality;

    public Furniture(){

    }
    public Furniture(int price, String color, int quality){
        this.price=price;
        this.color=color;
        this.quality=quality;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
    public int getQuality() {
        return quality;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void rearrangement(){
        System.out.println("Перестановка мебели завершена!");
    }
    public void repair(){
        System.out.println("Поломки устранены!");
    }
    public abstract void Fritz();
}
