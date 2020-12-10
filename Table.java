package com.company;

public class Table extends FurnitureShop {
    public Table() {

    }

    public Table(int price, String color, int quality){
        super(price, color, quality);
    }

    public void Fritz(){
        if(quality!=0){
            System.out.println("У стола обнаружено "+quality+" поломок. Требуется ремонт!");
        }
        else{
            System.out.println("Поломок не обнаружено!");
        }
    }
}
