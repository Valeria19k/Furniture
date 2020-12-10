package com.company;

public class FurnitureTest {
    public static void main (String[] args){
        Bed a= new Bed(11200,"Белый",0);
        a.Purchase();
        Table b = new Table(6700,"Бежевый",2);
        Cupboard k = new Cupboard(10500,"Чёрный",0);
        b.Fritz();
        b.repair();
        k.rearrangement();
    }
}
