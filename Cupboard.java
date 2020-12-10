package com.company;

public class Cupboard extends FurnitureShop {
    public Cupboard() {

    }

    public Cupboard(int price, String color, int quality){
        super(price, color, quality);
    }

    public void Fritz(){
        if(quality!=0){
            System.out.println("У шкафа обнаружено "+quality+" поломок. Требуется ремонт!");
        }
        else{
            System.out.println("Поломок не обнаружено!");
        }
    }
}
