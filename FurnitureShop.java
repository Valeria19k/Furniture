package com.company;

public class FurnitureShop extends Furniture {
    public FurnitureShop(){

    }

    public FurnitureShop(int price, String color, int quality){
        super(price, color, quality);
    }

    public void PurchaseReturns() {
        System.out.println("Предмет возвращён в магазин. Возвращаем стоимость товара - " + price + " рублей");
    }

    public void Purchase() {
        System.out.println("Покупка выполнена успешно! С вашего счёта списано " + price + " рублей");
    }
    public void Fritz(){

    }
}
