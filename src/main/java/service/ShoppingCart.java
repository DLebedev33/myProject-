package service;

import model.Food;

public class ShoppingCart {
    Food[] shoppingCartArray;

    public ShoppingCart(Food[] shoppingCartArray) {
        this.shoppingCartArray = shoppingCartArray;
    }

    public double getShoppingCartAmountNoDiscount() {
        double sumProducts = 0;
        for (int i = 0; i < shoppingCartArray.length; i++) {
            sumProducts += shoppingCartArray[i].getAmount() * shoppingCartArray[i].getPrice();
        }

        return sumProducts;
    }


    public double getShoppingCartAmountDiscount() {
        double sumProducts = 0;
        for (int i = 0; i < shoppingCartArray.length; i++) {
            double itemPrice = shoppingCartArray[i].getAmount() * shoppingCartArray[i].getPrice();
            double discount = shoppingCartArray[i].getDiscount();
            sumProducts += itemPrice * (1 - discount / 100);
        }

        return sumProducts;
        }

        public double getShoppingCartAmountVegetarian() {
        double sumProducts = 0;
        for (int i = 0; i < shoppingCartArray.length; i++) {
            if (shoppingCartArray[i].isVegetarian()) {
             sumProducts += shoppingCartArray[i].getAmount() * shoppingCartArray[i].getPrice();
            }
        }
        return sumProducts;
    }
}
