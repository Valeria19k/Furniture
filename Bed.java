package com.company;

public class Bed extends FurnitureShop {
    public Bed() {

    }

    public Bed(int price, String color, int quality){
        super(price, color, quality);
    }

    public void Fritz(){
        if(quality!=0){
            System.out.println("У кровати обнаружено "+quality+" поломок. Требуется ремонт!");
        }
        else{
            System.out.println("Поломок не обнаружено!");
        }
    }
}
