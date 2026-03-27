package model;

import static model.constants.Discount.redApple;

public abstract class Food implements Discountable {
    protected int amount;
    protected static double price;
    protected boolean isVegetarian;

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public Integer getAmount() {
        return amount;
    }

    public static Double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getDiscount() {
        return redApple;
    }
}
